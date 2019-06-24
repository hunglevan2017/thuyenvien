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
public class CrewCtrl {

	// Log
	Logger logger = LoggerFactory.getLogger(CrewCtrl.class);
	Type typeListMap = new TypeToken<List<Map<String, String>>>(){}.getType();
	
	@RequestMapping(value = { "/crew/{id}" }, method = RequestMethod.GET)
	public ModelAndView crew(@PathVariable("id") int crewId) {
		ModelAndView mav = new ModelAndView("component/crew");
		
		return mav;
	}
	
	@RequestMapping(value = { "/crew/resume/{id}" }, method = RequestMethod.GET)
	public ModelAndView crewResume(@PathVariable("id") int crewId) {
		ModelAndView mav = new ModelAndView("component/CrewResume");
		
		return mav;
	}
	

}
