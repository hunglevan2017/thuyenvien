package com.saigonbpo.dc.Controller;

import java.lang.reflect.Type;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.reflect.TypeToken;
import com.saigonbpo.dc.Mapper.AppMapper;
import com.saigonbpo.dc.Mapper.SeaThongTinDieuDongMapper;
import com.saigonbpo.dc.Mapper.UserMapper;
import com.saigonbpo.dc.Model.SeaThongTinDieuDong;

@Controller
public class UserCtrl {

	// Log
	Logger logger = LoggerFactory.getLogger(UserCtrl.class);
	Type typeListMap = new TypeToken<List<Map<String, String>>>() {
	}.getType();

	
	@Autowired
	UserMapper 	userMapper;
	
	@Autowired
	AppMapper 	appMapper;
	

	@RequestMapping(value = { "/User" }, method = RequestMethod.GET)
	public ModelAndView login_get(Model model, HttpSession session) {
		ModelAndView mav = new ModelAndView("component/user/index");
		return mav;
	}

	@RequestMapping(value = { "/addUser" }, method = RequestMethod.GET)
	public ModelAndView addShip() {

		ModelAndView mav = new ModelAndView("component/user/user_add");
		return mav;
	}

	@RequestMapping(value = { "/editUser/{id}" }, method = RequestMethod.GET)
	public ModelAndView editShip(@PathVariable("id") int id) {

		ModelAndView mav = new ModelAndView("component/user/user_edit");

		Map<String, Object> information = userMapper.sp_get_user_by_id(id);
		

		logger.info("msg:" + information);

		mav.addObject("ships", appMapper.SP_LOV_GET("T001"));
		mav.addObject("data",  information);

		return mav;
	}

	@RequestMapping(value = { "/deleteUser/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteShip(@PathVariable("id") int id) {

		ModelAndView mav = new ModelAndView("component/user/user_delete");
		Map<String, Object> information = userMapper.sp_get_user_by_id(id);
		mav.addObject("data", information);

		return mav;
	}
	
	
	

}
