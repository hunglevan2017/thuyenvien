package com.saigonbpo.dc.Controller;

import java.lang.reflect.Type;
import java.security.Principal;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.reflect.TypeToken;

@Controller
public class HomeCtrl {

	Logger logger = LoggerFactory.getLogger(HomeCtrl.class);
	
	Type typeListMap = new TypeToken<List<Map<String, String>>>(){}.getType();
	

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


	

}
