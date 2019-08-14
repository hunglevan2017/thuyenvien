package com.saigonbpo.dc.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.User;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saigonbpo.dc.Common.FuncUtil;
import com.saigonbpo.dc.Mapper.AppMapper;
import com.saigonbpo.dc.Mapper.MemberShipMapper;
import com.saigonbpo.dc.Mapper.UserMapper;
import com.saigonbpo.dc.Model.MemberShip;
import com.saigonbpo.dc.Model.MemberShipWithBLOBs;
import com.saigonbpo.dc.Model.SeaKinhNghiemLamViec;
import com.saigonbpo.dc.Model.UserSeagull;

@RestController
public class UserRestCtrl {
	
	@Autowired
	AppMapper appMapper;
	
	
	@Autowired
	UserMapper 	userMapper;
	
	
	@Autowired
	MemberShipMapper memberShipMapper;
	

	@RequestMapping(value = { "/user" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> getship() {
		List<Map<String, Object>> result = userMapper.sp_get_user();
		//if (result != null)
		//	result.remove(result.size() - 1);
		return result;
	}
	

	@RequestMapping(value = { "user/add" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> add_ship(@RequestBody Map<String, Object> condition) throws JSONException {

		FuncUtil.removeEmptyStringColumn(condition);

		int result = 1;
		try {
			condition.put("id", null);
			condition.put("Password", FuncUtil.ConvertToMD5(condition.get("Password").toString())) ;
			
			userMapper.add_user(condition);
			condition.put("UserId", condition.get("id"));
			userMapper.add_member(condition);
			condition = userMapper.sp_get_user_by_id(Integer.parseInt(condition.get("id").toString()));

			return condition;

		} catch (Exception ex) {
			return condition;
		}

	}

	@RequestMapping(value = { "user/edit" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> edit_ship(@RequestBody Map<String, Object> condition) throws JSONException {
		FuncUtil.removeEmptyStringColumn(condition);
	
		try {
			Map<String,Object> oldRecord = userMapper.sp_get_user_by_id(Integer.parseInt(condition.get("UserId").toString()));;
			
			if( condition.get("Password")==null || "".equals( condition.get("Password") ) )
			{
				condition.put("Password",oldRecord.get("Password"));
			}
			else
			{
				condition.put("Password", FuncUtil.ConvertToMD5(condition.get("Password").toString())) ;
			}
			
			
			
			if( "on".equals(condition.get("IsActive")) )
			{
				condition.put("IsActive", 1);
			}
			else
				condition.put("IsActive", 0);
			
			userMapper.edit_user(condition);
			condition = userMapper.sp_get_user_by_id(Integer.parseInt(condition.get("UserId").toString()));
			return condition;

		} catch (Exception ex) {
			ex.printStackTrace();
			return condition;
		}

	}

	@RequestMapping(value = { "user/delete" }, method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> delete_ship(@RequestBody Map<String, Object> condition) throws JSONException {
		try {
			userMapper.delete_user(condition);
			condition = userMapper.sp_get_user_by_id(Integer.parseInt(condition.get("UserId").toString()));
			return condition;

		} catch (Exception ex) {
			return condition;
		}

	}
	
	@RequestMapping(value = { "getUser/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public MemberShip getRank(@PathVariable("id") int userId) {
		

		MemberShip memberShip = new MemberShip();
		try
		{
			if( userId == 0 )
				return memberShip;	

					
			return memberShipMapper.selectByPrimaryKey(userId);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = { "/saveUser" }, method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public MemberShip saveExperience(@RequestBody MemberShipWithBLOBs record) {

		try
		{
			
			if(record.getUserid() == null )
			{
		
				Map<String,Object> condition = new HashMap<String, Object>();
				condition.put("UserName", record.getPasswordquestion());
				userMapper.add_user(condition);
				record.setUserid(Integer.parseInt( condition.get("id").toString()) );
				record.setPassword( FuncUtil.ConvertToMD5(record.getPassword()));
				memberShipMapper.insertSelective(record);
			}
			else {
				record.setPassword( FuncUtil.ConvertToMD5(record.getPassword()));
				memberShipMapper.updateByPrimaryKeySelective(record);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		return record;
	}


}
