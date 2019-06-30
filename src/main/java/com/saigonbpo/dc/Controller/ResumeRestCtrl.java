package com.saigonbpo.dc.Controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saigonbpo.dc.Mapper.AppMapper;
import com.saigonbpo.dc.Mapper.SeaFileMapper;
import com.saigonbpo.dc.Mapper.SeaThongTinGiaDinhMapper;
import com.saigonbpo.dc.Mapper.SeaThongTinThuyenVienMapper;
import com.saigonbpo.dc.Mapper.SeaTrinhDoChuyenMonMapper;
import com.saigonbpo.dc.Mapper.SeaTrinhDoNgoaiNguMapper;
import com.saigonbpo.dc.Model.SeaThongTinGiaDinh;
import com.saigonbpo.dc.Model.SeaTrinhDoChuyenMon;
import com.saigonbpo.dc.Model.SeaTrinhDoNgoaiNgu;


@RestController
public class ResumeRestCtrl {
	
	@Autowired
	AppMapper appMapper;
	
	@Autowired
	SeaThongTinThuyenVienMapper seaThongTinThuyenVienMapper;
	
	@Autowired
	SeaThongTinGiaDinhMapper seaThongTinGiaDinhMapper;
	
	@Autowired
	SeaTrinhDoChuyenMonMapper seaTrinhDoChuyenMonMapper;
	
	@Autowired
	SeaTrinhDoNgoaiNguMapper seaTrinhDoNgoaiNguMapper;
	
	@Autowired
	SeaFileMapper seaFileMapper;
	
	
	Logger logger = LoggerFactory.getLogger(ResumeRestCtrl.class);

	/**
	 * Thong Tin Gia Dinh
	 * @param crewId
	 * @return
	 */
	@RequestMapping(value = { "/crew/thongtingiadinh/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Map<String,Object>> thongtingiadinh(@PathVariable("id") int crewId) {
		
		return appMapper.sp_get_thongtingiadinh(crewId);
	}
	
	@RequestMapping(value = { "/getInformationFamily/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaThongTinGiaDinh getInformationFamily(@PathVariable("id") int SeaThongTinGiaDinhID) {
		
		logger.info(SeaThongTinGiaDinhID+"");
		SeaThongTinGiaDinh seaThongTinGiaDinh = new SeaThongTinGiaDinh();
		try
		{
			if( SeaThongTinGiaDinhID == 0 )
				return seaThongTinGiaDinh;
			return seaThongTinGiaDinhMapper.selectByPrimaryKey(SeaThongTinGiaDinhID);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = { "/saveInformationFamily" }, method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaThongTinGiaDinh editInformationFamily(@RequestBody SeaThongTinGiaDinh record) {
		try
		{
			if(record.getId() == null )
				seaThongTinGiaDinhMapper.insertSelective(record);
			else
				seaThongTinGiaDinhMapper.updateByPrimaryKeySelective(record);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		return record;
	}
	
	@RequestMapping(value = { "/removeInformationFamily/{id}" }, method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean removeInformationFamily(@PathVariable("id") int SeaThongTinGiaDinhID) {
		try
		{
				seaThongTinGiaDinhMapper.deleteByPrimaryKey(SeaThongTinGiaDinhID);
				return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	
	}
	
	/**
	 * Chuyen Mon
	 * @param crewId
	 * @return
	 */
	@RequestMapping(value = { "/crew/chuyenmon/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Map<String,Object>> chuyenmon(@PathVariable("id") int crewId) {
		
		return appMapper.sp_get_trinhdochuyenmon(crewId);
	}
	

	
	@RequestMapping(value = { "/getChuyenMon/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaTrinhDoChuyenMon getChuyenMon(@PathVariable("id") int SeaTrinhDoChuyenMonID) {
		

		SeaTrinhDoChuyenMon seaTrinhDoChuyenMon = new SeaTrinhDoChuyenMon();
		try
		{
			if( SeaTrinhDoChuyenMonID == 0 )
				return seaTrinhDoChuyenMon;
			return seaTrinhDoChuyenMonMapper.selectByPrimaryKey(SeaTrinhDoChuyenMonID);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = { "/saveChuyenMon" }, method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaTrinhDoChuyenMon saveChuyenMon(@RequestBody SeaTrinhDoChuyenMon record) {
		try
		{
			if(record.getId() == null )
				seaTrinhDoChuyenMonMapper.insertSelective(record);
			else
				seaTrinhDoChuyenMonMapper.updateByPrimaryKeySelective(record);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		return record;
	}
	
	@RequestMapping(value = { "/removeChuyenMon/{id}" }, method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean removeChuyenMon(@PathVariable("id") int SeaTrinhDoChuyenMonID) {
		try
		{
				seaTrinhDoChuyenMonMapper.deleteByPrimaryKey(SeaTrinhDoChuyenMonID);
				return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	
	}
	
	/**
	 * Ngoai ngu
	 * @param crewId
	 * @return
	 */
	@RequestMapping(value = { "/crew/ngoaingu/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Map<String,Object>> ngoaingu(@PathVariable("id") int crewId) {
		
		return appMapper.sp_get_trinhdongoaingu(crewId);
	}
	

	
	@RequestMapping(value = { "/getNgoaiNgu/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaTrinhDoNgoaiNgu getNgoaiNgu(@PathVariable("id") int SeaTrinhDoNgoaiNguID) {
		

		SeaTrinhDoNgoaiNgu seaTrinhDoNgoaiNgu = new SeaTrinhDoNgoaiNgu();
		try
		{
			if( SeaTrinhDoNgoaiNguID == 0 )
				return seaTrinhDoNgoaiNgu;
			return seaTrinhDoNgoaiNguMapper.selectByPrimaryKey(SeaTrinhDoNgoaiNguID);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = { "/saveNgoaiNgu" }, method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaTrinhDoNgoaiNgu saveNgoaiNgu(@RequestBody SeaTrinhDoNgoaiNgu record) {
		
		try
		{
			if(record.getId() == null )
				seaTrinhDoNgoaiNguMapper.insertSelective(record);
			else
				seaTrinhDoNgoaiNguMapper.updateByPrimaryKeySelective(record);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		return record;
	}
	
	@RequestMapping(value = { "/removeNgoaiNgu/{id}" }, method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean removeNgoaiNgu(@PathVariable("id") int SeaTrinhDoNgoaiNguID) {
		try
		{
				seaTrinhDoNgoaiNguMapper.deleteByPrimaryKey(SeaTrinhDoNgoaiNguID);
				return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	
	}
	
	
	


}
