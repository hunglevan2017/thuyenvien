package com.saigonbpo.dc.Controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.saigonbpo.dc.Mapper.AppMapper;
import com.saigonbpo.dc.Mapper.SeaFileMapper;
import com.saigonbpo.dc.Mapper.SeaThongTinThuyenVienMapper;
import com.saigonbpo.dc.Model.FullProfileCrew;
import com.saigonbpo.dc.Model.ResResult;
import com.saigonbpo.dc.Model.SeaFile;
import com.saigonbpo.dc.Model.SeaThongTinThuyenVien;
import com.saigonbpo.dc.Model.ShortProfileCrew;

@RestController
public class CrewRestCtrl {
	
	@Autowired
	AppMapper appMapper;
	
	@Autowired
	SeaThongTinThuyenVienMapper seaThongTinThuyenVienMapper;
	
	@Autowired
	SeaFileMapper seaFileMapper;

	
	public static double getRandomIntegerBetweenRange(double min, double max){
	    double x = (int)(Math.random()*((max-min)+1))+min;
	    return x;
	}
	

	@RequestMapping(value = { "/crew/profile/{id}" }, method = RequestMethod.GET)
	public FullProfileCrew crew(@PathVariable("id") int crewId) {
		
		FullProfileCrew  fullProfileCrew = new FullProfileCrew();
		fullProfileCrew.setSeaThongTinThuyenVien(new SeaThongTinThuyenVien());
		fullProfileCrew.setSeaFile(new SeaFile());
		fullProfileCrew.setShortProfileCrew(new ShortProfileCrew());
		
		
		fullProfileCrew.getSeaThongTinThuyenVien().setTinhtrangdieudong(0);
		fullProfileCrew.getSeaThongTinThuyenVien().setTrangthaiid("1");
		if(crewId==0)
			return fullProfileCrew;
		
		try
		{
	
			List<ShortProfileCrew> shortProfileCrew = appMapper.sp_sea_get_profile_user(crewId);
			SeaThongTinThuyenVien seaThongTinThuyenVien = seaThongTinThuyenVienMapper.selectByPrimaryKey(crewId);
			fullProfileCrew.setSeaFile(seaFileMapper.selectByPrimaryKey(seaThongTinThuyenVien.getHinh()));
			fullProfileCrew.setSeaThongTinThuyenVien(seaThongTinThuyenVien);
			if( shortProfileCrew.size()>1 )
			{
				if ("1".equals(shortProfileCrew.get(0).getTinhtrangdieudong())) {
					shortProfileCrew.get(0).setStatus_ship("On board");
				} else
					shortProfileCrew.get(0).setStatus_ship("On leave");
				fullProfileCrew.setShortProfileCrew(shortProfileCrew.get(0));
			}
			return fullProfileCrew;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	

	// Log
	Logger logger = LoggerFactory.getLogger(CrewRestCtrl.class);
	@RequestMapping(value = { "/ListOfBoatFollowState/{tinhtrangdieudong}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> ListOfBoatFollowState(@PathVariable("tinhtrangdieudong") int tinhtrangdieudong) {

		logger.info("ListOfBoatFollowState");
		// Input
		Map<String, Object> Input = new HashMap<>();
		List<Map<String, Object>> ListOfCrew = new ArrayList<>();

		if (tinhtrangdieudong >= 0) {
			// 1 is on leave
			// 0 is onboard
			Input.put("tinhtrangdieudong", tinhtrangdieudong);

			// Call Service
			ListOfCrew = appMapper.getListOfBoat(Input);
		} else if (tinhtrangdieudong == -2) {

			// Total
			Input.put("tinhtrangdieudong", null);
			logger.info(""+Input);
			
			ListOfCrew = appMapper.getListOfBoat_v3(Input);

			for (Iterator<Map<String, Object>> iter = ListOfCrew.iterator(); iter.hasNext();) {
				Map<String, Object> map = iter.next();
				Object c_id = map.get("trangthaiId").toString();
				if (c_id.equals("-2"))
					iter.remove();
			}

		} else if (tinhtrangdieudong == -1) {
			// Applicant
			Input.put("trangthaiId", 0);
			ListOfCrew = appMapper.getListOfBoat_v3(Input);
		} else if (tinhtrangdieudong == -3) {
			// Resign
			Input.put("trangthaiId", -2);
			ListOfCrew = appMapper.getListOfBoat_v3(Input);
		}

		logger.info("ListOfCrew:" + ListOfCrew.size());

		return ListOfCrew;

	}
	
	@Autowired
	private Environment env;
	
	@RequestMapping(value = "/crew/upload", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE })
	public SeaFile uploadFile(@RequestParam("file") MultipartFile uploadfile) {
		SeaFile seaFile = new SeaFile();
		try {

			// Init Time
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			System.out.println(formatter.format(date));
			int year = Calendar.getInstance().get(Calendar.YEAR);

			// Init Path Upload
			String PATH = env.getProperty("FILE_PATH");
			String directoryName = PATH + year;

			// Init File Name
			String originalFilename = uploadfile.getOriginalFilename();
			String filename = FilenameUtils.getBaseName(originalFilename) + date.getTime() + "."
					+ FilenameUtils.getExtension(originalFilename);
			// String filename = uploadfile.getOriginalFilename() ;

			File directory = new File(directoryName);
			if (!directory.exists()) {
				directory.mkdir();
				// If you require it to make the entire directory path including parents,
				// use directory.mkdirs(); here instead.
			}

			String filepath = Paths.get(directoryName, filename).toString();

			// Save the file locally
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
			stream.write(uploadfile.getBytes());
			stream.close();

			// Insert To Tab File DB
			seaFile.setName( year + "/" + filename);
			seaFile.setFullPath(originalFilename);
			seaFile.setSize( Float.parseFloat(uploadfile.getSize()+"") );
			
		

			if (uploadfile.getContentType().length() > 40) {
				int length = uploadfile.getContentType().length();
				seaFile.setType( uploadfile.getContentType().substring(length - 8, length) );
	
			} else {
				seaFile.setType( uploadfile.getContentType());
			}
			seaFileMapper.insertSelective(seaFile);
	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

		return seaFile;
	}
	
	@RequestMapping(value = "/crew/save", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE })
	public FullProfileCrew uploadFile(@RequestBody FullProfileCrew profile) {
	

		try {
			if(profile.getSeaFile()!= null && profile.getSeaFile().getId()!=null)
				profile.getSeaThongTinThuyenVien().setHinh(profile.getSeaFile().getId());
			
			if( profile.getSeaThongTinThuyenVien().getId() == null )
				seaThongTinThuyenVienMapper.insertSelective(profile.getSeaThongTinThuyenVien());
			else
				seaThongTinThuyenVienMapper.updateByPrimaryKeySelective( profile.getSeaThongTinThuyenVien() );
		} catch (Exception e) {
			e.printStackTrace();

		}
		return profile;

	}
	
	@RequestMapping(value = { "user/updateSS" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public int updateSS(@RequestBody List<Map<String, Object>> condition) throws JSONException {
		try {
			
			
			for (Map<String, Object> map : condition) {
				
				SeaThongTinThuyenVien record = seaThongTinThuyenVienMapper.selectByPrimaryKey(Integer.parseInt(map.get("id").toString()));
				record.setSs(Integer.parseInt(map.get("ss").toString()));
				seaThongTinThuyenVienMapper.updateByPrimaryKeySelective(record);
				
			}
			return 1;
		} catch (Exception ex) {
			logger.info(ex.toString());
			return 0;
		}

	}
	


}
