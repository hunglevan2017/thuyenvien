package com.saigonbpo.dc.Controller;

import java.lang.reflect.Type;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.reflect.TypeToken;
import com.saigonbpo.dc.Mapper.AppMapper;

@Controller
public class HomeCtrl {

	Logger logger = LoggerFactory.getLogger(HomeCtrl.class);
	
	Type typeListMap = new TypeToken<List<Map<String, String>>>(){}.getType();
	

	@Autowired
	AppMapper appMapper;
	
	
	@RequestMapping(value = { "/ListOfBoat/{tinhtrangdieudong}" }, method = RequestMethod.GET)
	public ModelAndView ListOfBoat(@PathVariable("tinhtrangdieudong") int tinhtrangdieudong) {
		ModelAndView mav = new ModelAndView("component/ListOfBoat");
		mav.addObject("tinhtrangdieudong", tinhtrangdieudong);
		return mav;
	}
	
	
	@RequestMapping(value = { "/assignment/{tauId}" }, method = RequestMethod.GET)
	public ModelAndView assignment() {
		ModelAndView mav = new ModelAndView("component/Assignment");
		return mav;
	}
	

	
	@RequestMapping(value = { "/dashboard" }, method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request) {
		Map<String, Object> loginInfo = (Map<String, Object>) request.getSession().getAttribute("loginInfo");



		ModelAndView mav = new ModelAndView("component/dashboard");
		Map<String, Object> Input = new HashMap<>();
		
		

		// Get Sumary Crews
		Map<String, Object> SumaryCrew = appMapper.get_SP_Get_statistical_DashBoard(Input);
		logger.info("SumaryCrew:" + SumaryCrew);

		// Get Crew Department
		String[] colorCrew = { 
				"#bf7d10", "#3498DB", "#2cba98", "#E74C3C","#e5d434",
				"#b52970", "#87fac6", "#f8b3de", "black","#f12f7d",
				"#bae9fe", "#82dcc3", "#7f83fa", "#962c63","#ef00d5",
				"#62f02", "#274331", "#1d8721", "#62e541","#4b35cc"
				};
		List<Map<String, Object>> ListCrewDepartment = appMapper.sp_statistic_department(Input);
	
		for (int i = 0; i < ListCrewDepartment.size(); i++) {
			int m = i;
			if (i > 19)
				m = 19;
			ListCrewDepartment.get(i).put("color", colorCrew[m]);
		}
		logger.info("ListCrewDepartment11:" + ListCrewDepartment);
		

		// Crew Ship
		List<Map<String, Object>> ListCrewShip = appMapper.sp_statistic_ship(Input);
		String[] color = { "fa fa-square blue", "fa fa-square green", "fa fa-square purple", "fa fa-square aero",
				"fa fa-square red", "fa fa-square yellow", "fa fa-square dark", "black" };


		
		for (int i = 0; i < ListCrewShip.size(); i++) {
			
			if( ListCrewShip.get(i).get("ten")==null )
				ListCrewShip.remove(i);
			
			int m = i;
			if (i > 7)
				m = 7;
			ListCrewShip.get(i).put("color", color[m]);
		}
		logger.info("ListCrewShip:" + ListCrewShip);

		mav.addObject("SumaryCrew", SumaryCrew);
		mav.addObject("ListCrewDepartment", ListCrewDepartment);
		mav.addObject("ListCrewShip", ListCrewShip);
		return mav;
	}


	

}
