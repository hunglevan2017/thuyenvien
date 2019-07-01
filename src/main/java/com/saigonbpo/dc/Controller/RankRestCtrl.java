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
import com.saigonbpo.dc.Mapper.SeaThongTinChucDanhMapper;
import com.saigonbpo.dc.Mapper.TabLovMapper;
import com.saigonbpo.dc.Model.SeaThongTinChucDanh;


@RestController
public class RankRestCtrl {
	
	@Autowired
	AppMapper appMapper;
		
	@Autowired
	SeaThongTinChucDanhMapper seaThongTinChucDanhMapper;
	
	@Autowired
	TabLovMapper tabLovMapper;
	
	Logger logger = LoggerFactory.getLogger(RankRestCtrl.class);
	
	@RequestMapping(value = { "/crew/rank/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Map<String,Object>> rank(@PathVariable("id") int crewId) {
		
		List<Map<String,Object>> result =  appMapper.SP_Boatman_Position_Search(crewId);
		result.remove(result.size()-1);
		return result;
	}
	
	@RequestMapping(value = { "crew/getRankById/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaThongTinChucDanh getRank(@PathVariable("id") int SeaThongTinChucDanhID) {
		

		SeaThongTinChucDanh seaThongTinChucDanh = new SeaThongTinChucDanh();
		try
		{
			if( SeaThongTinChucDanhID == 0 )
				return seaThongTinChucDanh;
			return seaThongTinChucDanhMapper.selectByPrimaryKey(SeaThongTinChucDanhID);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

	@RequestMapping(value = { "/saveRank" }, method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaThongTinChucDanh saveRank(@RequestBody SeaThongTinChucDanh record) {
		try
		{
			if(record.getId() == null )
				seaThongTinChucDanhMapper.insertSelective(record);
			else
				seaThongTinChucDanhMapper.updateByPrimaryKeySelective(record);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		return record;
	}
	
	@RequestMapping(value = { "/removeRank/{id}" }, method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean removeRank(@PathVariable("id") int SeaThongTinChucDanhID) {
		try
		{
				seaThongTinChucDanhMapper.deleteByPrimaryKey(SeaThongTinChucDanhID);
				return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	
	}
	
	
}
