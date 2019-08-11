package com.saigonbpo.dc.Controller;

import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saigonbpo.dc.Common.FuncUtil;
import com.saigonbpo.dc.Mapper.AppMapper;
import com.saigonbpo.dc.Mapper.UserMapper;

@RestController
public class UserRestCtrl {
	
	@Autowired
	AppMapper appMapper;
	
	
	@Autowired
	UserMapper 	userMapper;
	

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
			//userService.add_member(condition);
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


}
