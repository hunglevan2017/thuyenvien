package com.saigonbpo.dc.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.saigonbpo.dc.Mapper.AppMapper;
import com.saigonbpo.dc.Model.MasterData;

@RestController
public class HomeRestCtrl {
	
	public static double getRandomIntegerBetweenRange(double min, double max){
	    double x = (int)(Math.random()*((max-min)+1))+min;
	    return x;
	}
	
	@Autowired
	AppMapper appMapper;

	// Log
	Logger logger = LoggerFactory.getLogger(HomeRestCtrl.class);

	
	@RequestMapping(value = { "/masterdata/{code}" }, method = RequestMethod.GET)
	public List<MasterData> crew(@PathVariable("code") String code) {

		
		return appMapper.SP_LOV_GET(code);
	}
	
	@RequestMapping(value = { "/getSumCrew" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> getSumCrew() {
		Map<String, Object> Input = new HashMap<>();
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
		logger.info("ListCrewDepartment:" + ListCrewDepartment);
		return ListCrewDepartment;

	}
	

}
