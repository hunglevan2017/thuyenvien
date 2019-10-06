package com.saigonbpo.dc.Controller;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.saigonbpo.dc.Common.FuncUtil;
import com.saigonbpo.dc.Mapper.AppMapper;
import com.saigonbpo.dc.Mapper.SeaTauMapper;
import com.saigonbpo.dc.Mapper.SeaThongTinThuyenVienMapper;
import com.saigonbpo.dc.Model.MasterData;
import com.saigonbpo.dc.Model.SeaTau;
import com.saigonbpo.dc.Model.SeaThongTinThuyenVien;
import com.saigonbpo.dc.Model.ShortProfileCrew;


@Controller
public class ExportController {

	// Rest Template
	@Autowired
	RestTemplate restTemplate;


	// Log
	Logger logger = LoggerFactory.getLogger(ExportController.class);

	@Autowired
	private AppMapper appService;
	
	@Autowired
	SeaTauMapper seaTauMapper;
	
	@Autowired
	private SeaThongTinThuyenVienMapper seaThongTinThuyenVienMapper;
	
	
	/*
	@Autowired
	private ShipService shipService;

	@Autowired
	private CertificateService certificateService;

	public String modifyDateLayout(String inputDate) throws ParseException {
		Date date = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy", Locale.ENGLISH).parse(inputDate);
		return new SimpleDateFormat("dd/MM/yyyy").format(date);
	}
	*/


	@RequestMapping(value = "/report/Crewlist/{tauid}", method = RequestMethod.GET)
	public ModelAndView getExcel(@PathVariable("tauid") int tauid, HttpServletResponse response)
			throws EncryptedDocumentException, InvalidFormatException, IOException, ParseException {


		SeaTau ship = seaTauMapper.selectByPrimaryKey(tauid);
		// Input
		Map<String, Object> Input = new HashMap<>();
		List<Map<String, Object>> ListOfCrew = new ArrayList<>();
		Input.put("tinhtrangdieudong", 1);
		// Call Service
		ListOfCrew = appService.getListOfBoat(Input);
		for (Iterator<Map<String, Object>> iter = ListOfCrew.iterator(); iter.hasNext();) {
			Map<String, Object> map = iter.next();
			Object c_id = map.get("tauOffHoacOnGanNhat").toString();
			if (!c_id.equals(ship.getTen()))
				iter.remove();
		}

		if (ship != null) {

			// Set Name File Download
			String fileName = ship.getTen() + ".xlsx";
			response.setHeader("Content-disposition", "attachment; filename=" + fileName);

			// Read Template
			InputStream fis = null;
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			fis = classloader.getResourceAsStream("ReportTemplate/Crewlist.xlsx");

			// Init WorkBook
			org.apache.poi.ss.usermodel.Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheetAt(0);

			// Set Data Ship
			int tempRow = 9;
			int tempCol = 3;

			FuncUtil.setCellValH(ship.getTen() != null ? ship.getTen() : "", sheet, tempRow, tempCol,
					null);
			FuncUtil.setCellValH(ship.getImo() != null ? ship.getImo() : "", sheet, tempRow, tempCol + 4,
					null);
			FuncUtil.setCellValH(ship.getCallsign() != null ? ship.getCallsign() : "", sheet, tempRow,
					(tempCol + 4 * 2), null);

			int rowbegin = 13;
			int i = 0;

			CellStyle cellStyle = sheet.getRow(rowbegin - 1).getCell(0).getCellStyle();
			cellStyle.setAlignment(HorizontalAlignment.CENTER);
			CellStyle cellStyle17 = sheet.getRow(16).getCell(8).getCellStyle();

			sheet.shiftRows(rowbegin, sheet.getLastRowNum(), ListOfCrew.size());

			Row r = sheet.getRow(16 + ListOfCrew.size());
			r.setHeight((short) 700);

			for (int g = 1; g <= 11; g++) {
				Cell c = r.getCell(g, MissingCellPolicy.CREATE_NULL_AS_BLANK);
				c.setCellStyle(cellStyle17);
			}

			List<MasterData> list_master_data = appService.SP_LOV_GET("S001");

			for (Map<String, Object> datanew : ListOfCrew) {
				// FuncUtil.removeEmptyStringColumn(datanew);
				Map<String, Object> filter = new HashMap<>();
				filter.put("thuyenvienId", datanew.get("id").toString());
				filter.put("thuyenvienid", datanew.get("id").toString());
				List<Map<String, Object>> option = appService.getMainCertificateCrew(filter);
				Map<String, Object> InfoCrew = appService.sp_get_info_crew(filter);
				
				Map<String, Object> seamanBook = appService.getSeamanBook(filter);

				FuncUtil.setCellValH(String.valueOf(i + 1), sheet, rowbegin, 1, cellStyle);
				FuncUtil.setCellValH(datanew.get("hoten").toString(), sheet, rowbegin, 2, cellStyle);
				FuncUtil.setCellValH(datanew.get("chucdanh").toString(), sheet, rowbegin, 3, cellStyle);

				if (InfoCrew.get("noisinh") != null)
					FuncUtil.setCellValH(InfoCrew.get("noisinh").toString(), sheet, rowbegin, 6, cellStyle);

				if (InfoCrew.get("quoctich") != null) {
					for (MasterData quoctich : list_master_data) {
				

						String quoctichid = InfoCrew.get("quoctich").toString();
						
						@SuppressWarnings("unchecked")
						String quoctichm = quoctich.getLov().getID()+"";

						if (quoctichid.equals(quoctichm)) {
							FuncUtil.setCellValH(quoctich.getTEXT(), sheet, rowbegin, 4, cellStyle);
						}
					}
				}

				if (option.size() >= 1) {
					// FuncUtil.setCellValH(option.get(0).get("text").toString(),sheet,rowbegin,4,cellStyle);
					FuncUtil.setCellValH(option.get(0).get("so").toString(), sheet, rowbegin, 7, cellStyle);
					FuncUtil.setCellValH(option.get(0).get("denngay").toString(), sheet, rowbegin, 8, cellStyle);
				} else {
					FuncUtil.setCellValH("", sheet, rowbegin, 7, cellStyle);
					FuncUtil.setCellValH("", sheet, rowbegin, 8, cellStyle);
				}

				if (seamanBook.get("so") != null ) {
					FuncUtil.setCellValH(seamanBook.get("so").toString(), sheet, rowbegin, 9, cellStyle);
				} else {
					FuncUtil.setCellValH("", sheet, rowbegin, 9, cellStyle);
				}
				
		
				FuncUtil.setCellValH("", sheet, rowbegin, 10, cellStyle);
			
				


				String temp = "";
				if (datanew.get("ngaysinh") != null) {
					temp = FuncUtil.formatDateToYYYYMMDD(datanew.get("ngaysinh").toString());

				}
				FuncUtil.setCellValH(temp, sheet, rowbegin, 5, cellStyle);

				FuncUtil.setCellValH("", sheet, rowbegin, 11, cellStyle);
				FuncUtil.setCellValH("", sheet, rowbegin, 12, cellStyle);


				i++;
				rowbegin++;

			}

			OutputStream out = response.getOutputStream();
			workbook.write(out);
			out.flush();

			fis.close();
			out.close();

		}
		return null;
		// return new ModelAndView(new ExcelView(), "type_report", 1);
	}
	

	@RequestMapping(value = "/report/Certificate/{thuyenvienId}", method = RequestMethod.GET)
	public ModelAndView getCertificate(@PathVariable("thuyenvienId") int thuyenvienId, HttpServletResponse response)
			throws EncryptedDocumentException, InvalidFormatException, IOException, ParseException {

		Map<String, Object> filter = new HashMap<>();
		filter.put("thuyenvienId", thuyenvienId);
		filter.put("thuyenvienid", thuyenvienId);
		
		

		
		List<ShortProfileCrew> profile = appService.sp_sea_get_profile_user(thuyenvienId);
		SeaThongTinThuyenVien seaThongTinThuyenVien = seaThongTinThuyenVienMapper.selectByPrimaryKey(thuyenvienId);

		if (profile != null) {

			// Set Name File Download
			String fileName = seaThongTinThuyenVien.getHoten() + " Certificate" + ".xlsx";
			fileName = URLEncoder.encode(fileName, "UTF-8");
			response.setHeader("Content-disposition", "attachment; filename=" + fileName);

			// Read Template
			InputStream fis = null;
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			fis = classloader.getResourceAsStream("ReportTemplate/Certificate.xlsx");

			// Init WorkBook
			org.apache.poi.ss.usermodel.Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheetAt(0);

			// Set Data Ship
			int tempRow = 9;
			int tempCol = 3;
			
			
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");



			FuncUtil.setCellValH(seaThongTinThuyenVien.getHoten()  != null ? seaThongTinThuyenVien.getHoten()  : "",
					sheet, 4, 3, null);
			FuncUtil.setCellValH(
					seaThongTinThuyenVien.getNgaysinh() != null ? format.format(seaThongTinThuyenVien.getNgaysinh()) : "", sheet, 5,
					3, null);
			
			if(profile.get(0)!=null)
			{
			FuncUtil.setCellValH(
					profile.get(0).getChucdanh() != null ? profile.get(0).getChucdanh() : "", sheet, 5,
					6, null);
			}
			else {
				FuncUtil.setCellValH(
						"", sheet, 5,
						6, null);
			}

			int rowbegin = 13;
			int i = 0;

			CellStyle cellStyle = sheet.getRow(rowbegin - 1).getCell(0).getCellStyle();
			cellStyle.setAlignment(HorizontalAlignment.CENTER);

			List<Map<String, Object>> result = appService.sp_get_certificate(thuyenvienId + "");

			if (result.size() > 1) {
				result.remove(result.size() - 1);

				sheet.shiftRows(rowbegin, sheet.getLastRowNum(), result.size());
				short HeightSmall = 700;
				short HeightLarge = 1400;
				Row r = sheet.getRow(53 + result.size());
				r.setHeight(HeightSmall);
				r = sheet.getRow(54 + result.size());
				r.setHeight(HeightLarge);
				r = sheet.getRow(55 + result.size());
				r.setHeight(HeightSmall);
				r = sheet.getRow(56 + result.size());
				r.setHeight(HeightLarge);

				for (Map<String, Object> data : result) {
					FuncUtil.setCellValH(String.valueOf(i + 1), sheet, rowbegin, 1, cellStyle);
					FillData(data.get("tenchungchi"), sheet, rowbegin, 2, cellStyle);
					FillData(data.get("so"), sheet, rowbegin, 4, cellStyle);

					String temp = "";
					DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					if (data.get("tungay") != null) {
						Date date = (Date) data.get("tungay");
						temp = dateFormat.format(date);
						FillData(temp, sheet, rowbegin, 5, cellStyle);
					}
					else
						FillData(temp, sheet, rowbegin, 5, cellStyle);
					
					temp = "";
					if (data.get("denngay") != null) {
						Date date = (Date) data.get("denngay");
						temp = dateFormat.format(date);
						FillData(temp, sheet, rowbegin, 6, cellStyle);
					}
					else
						FillData(temp, sheet, rowbegin, 6, cellStyle);

					// FillData(data.get("tungay"),sheet,rowbegin,4,cellStyle);
					// FillData(data.get("denngay"),sheet,rowbegin,5,cellStyle);
					FuncUtil.setCellValH("", sheet, rowbegin, 3, cellStyle);
					FuncUtil.setCellValH("", sheet, rowbegin, 7, cellStyle);
					FuncUtil.setCellValH("", sheet, rowbegin, 8, cellStyle);
					sheet.addMergedRegion(new CellRangeAddress(rowbegin, rowbegin, 1, 2));
					sheet.addMergedRegion(new CellRangeAddress(rowbegin, rowbegin, 6, 7));
					i++;
					rowbegin++;
				}
			}

			OutputStream out = response.getOutputStream();
			workbook.write(out);
			out.flush();

			fis.close();
			out.close();

		}

		return null;
		// return new ModelAndView(new ExcelView(), "type_report", 1);
	}

	private void FillData(Object object, Sheet sheet, int rowbegin, int col, CellStyle cellStyle) {
		// TODO Auto-generated method stub
		if (object != null)
			FuncUtil.setCellValH(object.toString(), sheet, rowbegin, col, cellStyle);
		else
			FuncUtil.setCellValH("", sheet, rowbegin, col, cellStyle);

	}

	@RequestMapping(value = "/report/DuTru", method = RequestMethod.GET)
	public ModelAndView getDuTru(HttpServletResponse response)
			throws EncryptedDocumentException, InvalidFormatException, IOException, ParseException {

		Map<String, Object> filter = new HashMap<>();
		filter.put("tinhtrangdieudong", 0);

		// Call Service

		// Set Name File Download
		String fileName = "Danh Sach Thuyen Vien Du Tru - Du Tru" + ".xlsx";
		fileName = URLEncoder.encode(fileName, "UTF-8");
		response.setHeader("Content-disposition", "attachment; filename=" + fileName);

		// Read Template
		InputStream fis = null;
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		fis = classloader.getResourceAsStream("ReportTemplate/DSTV - Du Tru.xlsx");

		// Init WorkBook
		org.apache.poi.ss.usermodel.Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheetAt(0);

		int rowbegin = 8;
		int i = 0;

		CellStyle cellStyle = sheet.getRow(rowbegin - 1).getCell(0).getCellStyle();
		cellStyle.setAlignment(HorizontalAlignment.CENTER);

		List<Map<String, Object>> result = appService.getListOfBoat(filter);


			sheet.shiftRows(rowbegin, sheet.getLastRowNum(), result.size());

			for (Map<String, Object> data : result) {
				FuncUtil.setCellValH(String.valueOf(i + 1), sheet, rowbegin, 1, cellStyle);
				FillData(data.get("hoten"), sheet, rowbegin, 2, cellStyle);
				FillData(data.get("chucdanh"), sheet, rowbegin, 3, cellStyle);
				FillData(data.get("diachitamtru"), sheet, rowbegin, 4, cellStyle);
				FillData(data.get("ngayOffHoacOnGanNhat"), sheet, rowbegin, 5, cellStyle);

				
				/**/
				for(int j=6 ;j<=15;j++)
				{
					if(j==9 && "1".equals(data.get("ss").toString()) )
					{
						FuncUtil.setCellValH("X", sheet, rowbegin, j, cellStyle);
					}
					else
					{
						FuncUtil.setCellValH("", sheet, rowbegin, j, cellStyle);
					}
				}
				
		
				
				

				i++;
				rowbegin++;
			}
			OutputStream out = response.getOutputStream();
			workbook.write(out);
			out.flush();

			fis.close();
			out.close();



		return null;
		// return new ModelAndView(new ExcelView(), "type_report", 1);
	}
	
	@RequestMapping(value = "/report/onboard", method = RequestMethod.GET)
	public ModelAndView getOnboard(HttpServletResponse response)
			throws EncryptedDocumentException, InvalidFormatException, IOException, ParseException {

		Map<String, Object> filter = new HashMap<>();
		filter.put("tinhtrangdieudong", 1);

		// Call Service

		// Set Name File Download
		String fileName = "Danh Sach Thuyen Vien on board" + ".xlsx";
		fileName = URLEncoder.encode(fileName, "UTF-8");
		response.setHeader("Content-disposition", "attachment; filename=" + fileName);

		// Read Template
		InputStream fis = null;
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		fis = classloader.getResourceAsStream("ReportTemplate/DSTV - Onboard.xlsx");

		// Init WorkBook
		org.apache.poi.ss.usermodel.Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheetAt(0);

		int rowbegin = 8;
		int i = 0;

		CellStyle cellStyle = sheet.getRow(rowbegin - 1).getCell(0).getCellStyle();
		cellStyle.setAlignment(HorizontalAlignment.CENTER);

		List<Map<String, Object>> result = appService.getListOfBoat(filter);


			sheet.shiftRows(rowbegin, sheet.getLastRowNum(), result.size());

			for (Map<String, Object> data : result) {
				FuncUtil.setCellValH(String.valueOf(i + 1), sheet, rowbegin, 1, cellStyle);
				FillData(data.get("hoten"), sheet, rowbegin, 2, cellStyle);
				FillData(data.get("chucdanh"), sheet, rowbegin, 3, cellStyle);
				FillData(data.get("diachitamtru"), sheet, rowbegin, 4, cellStyle);
				FillData(data.get("ngayOffHoacOnGanNhat"), sheet, rowbegin, 5, cellStyle);
				for(int j=6 ;j<=15;j++)
				{
					FuncUtil.setCellValH("", sheet, rowbegin, j, cellStyle);
				}
				i++;
				rowbegin++;
			}
			OutputStream out = response.getOutputStream();
			workbook.write(out);
			out.flush();

			fis.close();
			out.close();



		return null;
		// return new ModelAndView(new ExcelView(), "type_report", 1);
	}
	

	@RequestMapping(value = "/report/all", method = RequestMethod.GET)
	public ModelAndView getAll(HttpServletResponse response)
			throws EncryptedDocumentException, InvalidFormatException, IOException, ParseException {

		Map<String, Object> filter = new HashMap<>();
		filter.put("tinhtrangdieudong", null);

		// Call Service

		// Set Name File Download
		String fileName = "Danh Sach Thuyen Vien on board" + ".xlsx";
		fileName = URLEncoder.encode(fileName, "UTF-8");
		response.setHeader("Content-disposition", "attachment; filename=" + fileName);

		// Read Template
		InputStream fis = null;
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		fis = classloader.getResourceAsStream("ReportTemplate/DSTV - Onboard.xlsx");

		// Init WorkBook
		org.apache.poi.ss.usermodel.Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheetAt(0);

		int rowbegin = 8;
		int i = 0;

		CellStyle cellStyle = sheet.getRow(rowbegin - 1).getCell(0).getCellStyle();
		cellStyle.setAlignment(HorizontalAlignment.CENTER);

		List<Map<String, Object>> result = appService.getListOfBoat_v3(filter);
		
		for (Iterator<Map<String, Object>> iter = result.iterator(); iter.hasNext();) {
			Map<String, Object> map = iter.next();
			Object c_id = map.get("trangthaiId").toString();
			if (c_id.equals("-2"))
				iter.remove();
		}


			sheet.shiftRows(rowbegin, sheet.getLastRowNum(), result.size());

			for (Map<String, Object> data : result) {
				FuncUtil.setCellValH(String.valueOf(i + 1), sheet, rowbegin, 1, cellStyle);
				FillData(data.get("hoten"), sheet, rowbegin, 2, cellStyle);
				FillData(data.get("chucdanh"), sheet, rowbegin, 3, cellStyle);
				FillData(data.get("diachitamtru"), sheet, rowbegin, 4, cellStyle);
				FillData(data.get("ngayOffHoacOnGanNhat"), sheet, rowbegin, 5, cellStyle);
				for(int j=6 ;j<=15;j++)
				{
					FuncUtil.setCellValH("", sheet, rowbegin, j, cellStyle);
				}
				i++;
				rowbegin++;
			}
			OutputStream out = response.getOutputStream();
			workbook.write(out);
			out.flush();

			fis.close();
			out.close();



		return null;
		// return new ModelAndView(new ExcelView(), "type_report", 1);
	}


}
