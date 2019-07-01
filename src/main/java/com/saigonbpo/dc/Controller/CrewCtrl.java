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
	Type typeListMap = new TypeToken<List<Map<String, String>>>() {
	}.getType();

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
	
	@RequestMapping(value = { "/crew/experience/{id}" }, method = RequestMethod.GET)
	public ModelAndView crewExperience(@PathVariable("id") int crewId) {
		ModelAndView mav = new ModelAndView("component/CrewExperience");
		return mav;
	}
	
	@RequestMapping(value = { "/crew/certificate/{id}" }, method = RequestMethod.GET)
	public ModelAndView crewCertificate(@PathVariable("id") int crewId) {
		ModelAndView mav = new ModelAndView("component/CrewCertificate");
		return mav;
	}

	@RequestMapping(value = { "/editInformationFamily/{id}" }, method = RequestMethod.GET)
	public ModelAndView editInformationFamily(@PathVariable("id") int SeaThongTinGiaDinhID) {
		ModelAndView mav = new ModelAndView("component/resume/information_edit");
		mav.addObject("SeaThongTinGiaDinhID", SeaThongTinGiaDinhID);
		return mav;
	}

	@RequestMapping(value = { "/deleteInformationFamily/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteInformationFamily(@PathVariable("id") int SeaThongTinGiaDinhID) {
		ModelAndView mav = new ModelAndView("component/resume/information_delete");
		mav.addObject("SeaThongTinGiaDinhID", SeaThongTinGiaDinhID);
		return mav;
	}

	@RequestMapping(value = { "/editChuyenMon/{id}" }, method = RequestMethod.GET)
	public ModelAndView editChuyenMon(@PathVariable("id") int SeaTrinhDoChuyenMonID) {
		ModelAndView mav = new ModelAndView("component/resume/chuyenmon_edit");
		mav.addObject("SeaTrinhDoChuyenMonID", SeaTrinhDoChuyenMonID);
		return mav;
	}

	@RequestMapping(value = { "/deleteChuyenMon/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteChuyenMon(@PathVariable("id") int SeaTrinhDoChuyenMonID) {
		ModelAndView mav = new ModelAndView("component/resume/chuyenmon_delete");
		mav.addObject("SeaTrinhDoChuyenMonID", SeaTrinhDoChuyenMonID);
		return mav;
	}

	@RequestMapping(value = { "/editNgoaiNgu/{id}" }, method = RequestMethod.GET)
	public ModelAndView editNgoaiNgu(@PathVariable("id") int SeaTrinhDoNgoaiNguID) {
		ModelAndView mav = new ModelAndView("component/resume/ngoaingu_edit");
		mav.addObject("SeaTrinhDoNgoaiNguID", SeaTrinhDoNgoaiNguID);
		return mav;
	}

	@RequestMapping(value = { "/deleteNgoaiNgu/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteNgoaiNgu(@PathVariable("id") int SeaTrinhDoNgoaiNguID) {
		ModelAndView mav = new ModelAndView("component/resume/ngoaingu_delete");
		mav.addObject("SeaTrinhDoNgoaiNguID", SeaTrinhDoNgoaiNguID);
		return mav;
	}

	@RequestMapping(value = { "/editViTinh/{id}" }, method = RequestMethod.GET)
	public ModelAndView editViTinh(@PathVariable("id") int SeaTrinhDoViTinhID) {
		ModelAndView mav = new ModelAndView("component/resume/vitinh_edit");
		mav.addObject("SeaTrinhDoViTinhID", SeaTrinhDoViTinhID);
		return mav;
	}

	@RequestMapping(value = { "/deleteViTinh/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteViTinh(@PathVariable("id") int SeaTrinhDoViTinhID) {
		ModelAndView mav = new ModelAndView("component/resume/vitinh_delete");
		mav.addObject("SeaTrinhDoViTinhID", SeaTrinhDoViTinhID);
		return mav;
	}
	
	
	@RequestMapping(value = { "/editCertificate/{id}" }, method = RequestMethod.GET)
	public ModelAndView editCertificate(@PathVariable("id") int SeaChungChiThuyenVienID) {
		ModelAndView mav = new ModelAndView("component/certificate/certificate_edit");
		mav.addObject("SeaChungChiThuyenVienID", SeaChungChiThuyenVienID);
		return mav;
	}

	@RequestMapping(value = { "/deleteCertificate/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteCertificate(@PathVariable("id") int SeaChungChiThuyenVienID) {
		ModelAndView mav = new ModelAndView("component/certificate/certificate_delete");
		mav.addObject("SeaChungChiThuyenVienID", SeaChungChiThuyenVienID);
		return mav;
	}
	
	
	@RequestMapping(value = { "/editExperience/{id}" }, method = RequestMethod.GET)
	public ModelAndView editExperience(@PathVariable("id") int SeaKinhNghiemLamViecID) {
		ModelAndView mav = new ModelAndView("component/experience/experience_edit");
		mav.addObject("SeaKinhNghiemLamViecID", SeaKinhNghiemLamViecID);
		return mav;
	}

	@RequestMapping(value = { "/deleteExperience/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteExperience(@PathVariable("id") int SeaKinhNghiemLamViecID) {
		ModelAndView mav = new ModelAndView("component/experience/experience_delete");
		mav.addObject("SeaKinhNghiemLamViecID", SeaKinhNghiemLamViecID);
		return mav;
	}
	
	

}
