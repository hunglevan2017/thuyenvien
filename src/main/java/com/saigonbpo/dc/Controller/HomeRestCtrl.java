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
	

}
