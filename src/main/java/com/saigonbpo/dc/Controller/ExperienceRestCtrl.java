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
import com.saigonbpo.dc.Mapper.SeaKinhNghiemLamViecMapper;
import com.saigonbpo.dc.Model.SeaKinhNghiemLamViec;


@RestController
public class ExperienceRestCtrl {
	
	@Autowired
	AppMapper appMapper;
	
	
	@Autowired
	SeaKinhNghiemLamViecMapper seaKinhNghiemLamViecMapper;

	
	Logger logger = LoggerFactory.getLogger(ExperienceRestCtrl.class);
	

	@RequestMapping(value = { "/crew/experience/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Map<String,Object>> experience(@PathVariable("id") String crewId) {
		
		return appMapper.queryKinhNghiemLamviec(crewId);
	}
	
	@RequestMapping(value = { "/crew/experienceOther/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Map<String,Object>> experienceOther(@PathVariable("id") String crewId) {
		
		return appMapper.queryKinhNghiemLamviecOther(crewId);

	}
	

	@RequestMapping(value = { "crew/experienceById/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaKinhNghiemLamViec getExperience(@PathVariable("id") int SeaKinhNghiemLamViecID) {


		SeaKinhNghiemLamViec seaKinhNghiemLamViec = new SeaKinhNghiemLamViec();
		try
		{
			if( SeaKinhNghiemLamViecID == 0 )
				return seaKinhNghiemLamViec;
			return seaKinhNghiemLamViecMapper.selectByPrimaryKey(SeaKinhNghiemLamViecID);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}


	@RequestMapping(value = { "/saveExperience" }, method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaKinhNghiemLamViec saveExperience(@RequestBody SeaKinhNghiemLamViec record) {

		try
		{
			if(record.getId() == null )
				seaKinhNghiemLamViecMapper.insertSelective(record);
			else
				seaKinhNghiemLamViecMapper.updateByPrimaryKeySelective(record);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		return record;
	}

	@RequestMapping(value = { "/removeExperience/{id}" }, method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean removeExperience(@PathVariable("id") int SeaKinhNghiemLamViecID) {
		try
		{
				seaKinhNghiemLamViecMapper.deleteByPrimaryKey(SeaKinhNghiemLamViecID);
				return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}

	}

	
}
