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

import com.saigonbpo.dc.Common.FuncUtil;
import com.saigonbpo.dc.Mapper.AppMapper;
import com.saigonbpo.dc.Mapper.SeaThongTinChucDanhMapper;
import com.saigonbpo.dc.Mapper.TabLovMapper;
import com.saigonbpo.dc.Model.SeaThongTinChucDanh;



//@RestController
public class MasterDataRestCtrl {
	
	@Autowired
	AppMapper appMapper;
		
	@Autowired
	SeaThongTinChucDanhMapper seaThongTinChucDanhMapper;
	
	@Autowired
	TabLovMapper tabLovMapper;
	
	Logger logger = LoggerFactory.getLogger(MasterDataRestCtrl.class);
	

	@RequestMapping(value = { "masterdata/add" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> add_masterdata(@RequestBody Map<String, Object> condition)   {
		int result = 1;
		logger.info("masterdata Input: " + condition);
		FuncUtil.removeEmptyStringColumn(condition);
		try {
			condition.put("ID", null);
			
			if( "on".equals(condition.get("ISACTIVE")) )
			{
				condition.put("ISACTIVE", 1);
			}
			else
				condition.put("ISACTIVE", 0);
			
			appMapper.add_masterdata(condition);
			condition = appMapper.sp_get_Masterdata_by_id(Integer.parseInt(condition.get("ID").toString()));
			Map<String,Object> parent = appMapper.sp_get_Masterdata_by_id(Integer.parseInt(condition.get("PARENTID").toString()));
			condition.put("textparent", parent.get("text").toString());

			return condition;

		} catch (Exception ex) {
			ex.printStackTrace();
			logger.info(ex.toString());
			return condition;
		}

	}

	@RequestMapping(value = { "masterdata/edit" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> edit_masterdata(@RequestBody Map<String, Object> condition)   {
		logger.info("masterdata Input: " + condition);
		FuncUtil.removeEmptyStringColumn(condition);
		try {
			if( "on".equals(condition.get("ISACTIVE")) )
			{
				condition.put("ISACTIVE", 1);
			}
			else
				condition.put("ISACTIVE", 0);
			
			appMapper.edit_masterdata(condition);
			condition = appMapper.sp_get_Masterdata_by_id(Integer.parseInt(condition.get("ID").toString()));
			Map<String,Object> parent = appMapper.sp_get_Masterdata_by_id(Integer.parseInt(condition.get("PARENTID").toString()));
			condition.put("textparent", parent.get("text").toString());
			return condition;

		} catch (Exception ex) {
			ex.printStackTrace();
			return condition;
		}

	}

	@RequestMapping(value = { "masterdata/delete" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> delete_masterdata(@RequestBody Map<String, Object> condition)   {
		logger.info("masterdata Input: " + condition);
		FuncUtil.removeEmptyStringColumn(condition);
		try {

			appMapper.delete_masterdata(condition);
			condition = appMapper.sp_get_Masterdata_by_id(Integer.parseInt(condition.get("ID").toString()));
			Map<String,Object> parent = appMapper.sp_get_Masterdata_by_id(Integer.parseInt(condition.get("PARENTID").toString()));
			condition.put("textparent", parent.get("text").toString());
			return condition;

		} catch (Exception ex) {
			logger.info(ex.toString());
			return condition;
		}

	}
	
	
}
