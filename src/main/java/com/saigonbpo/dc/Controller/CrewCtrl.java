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
	
	
	@RequestMapping(value = { "/editInformationFamily/{id}" }, method = RequestMethod.GET)
	public ModelAndView editInformationFamily(@PathVariable("id") int SeaThongTinGiaDinhID ) {
		ModelAndView mav = new ModelAndView("component/resume/information_edit");
		mav.addObject("SeaThongTinGiaDinhID",SeaThongTinGiaDinhID);
		return mav;
	}
	

	@RequestMapping(value = { "/deleteInformationFamily/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteInformationFamily(@PathVariable("id") int SeaThongTinGiaDinhID ) {
		ModelAndView mav = new ModelAndView("component/resume/information_delete");
		mav.addObject("SeaThongTinGiaDinhID",SeaThongTinGiaDinhID);
		return mav;
	}
	
	
	@RequestMapping(value = { "/editChuyenMon/{id}" }, method = RequestMethod.GET)
	public ModelAndView editChuyenMon(@PathVariable("id") int SeaTrinhDoChuyenMonID ) {
		ModelAndView mav = new ModelAndView("component/resume/chuyenmon_edit");
		mav.addObject("SeaTrinhDoChuyenMonID",SeaTrinhDoChuyenMonID);
		return mav;
	}
	

	@RequestMapping(value = { "/deleteChuyenMon/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteChuyenMon(@PathVariable("id") int SeaTrinhDoChuyenMonID ) {
		ModelAndView mav = new ModelAndView("component/resume/chuyenmon_delete");
		mav.addObject("SeaTrinhDoChuyenMonID",SeaTrinhDoChuyenMonID);
		return mav;
	}
	

}
