package com.saigonbpo.dc.Controller;

import java.lang.reflect.Type;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.saigonbpo.dc.Model.SeaThongTinDieuDong;

//@Controller
public class MasterDataCtrl {

	// Log
	Logger logger = LoggerFactory.getLogger(MasterDataCtrl.class);
	Type typeListMap = new TypeToken<List<Map<String, String>>>() {
	}.getType();

	
	@Autowired
	AppMapper appMapper;
	
	@Autowired
	SeaThongTinDieuDongMapper seaThongTinDieuDongMapper;
	
	// Create new crew load page
		@RequestMapping(value = { "/MasterData" }, method = RequestMethod.GET)
		public ModelAndView masterdata() {
				ModelAndView mav = new ModelAndView("component/masterdata/masterdata_index");
				
				// Load Main Info Crew
				List<Map<String, Object>> categoryMasterData = appMapper.sp_tab_department();
				// Load Left Info Crew
				mav.addObject("categoryMasterData", categoryMasterData);
				
				return mav;
		}
		
		

		
		@RequestMapping(value = { "/addMasterdata/{code}" }, method = RequestMethod.GET)
		public ModelAndView addExperience(@PathVariable("code") String code) {
			
			ModelAndView mav = new ModelAndView("component/masterdata/masterdata_add");
			
			Map<String,Object> category = appMapper.SP_TAB_LOV_CAT_GETPARENTCODE(code);
			List<Map<String,Object>> parentCatogory = new  ArrayList<>();
			
			logger.info("" + category);
			if( !("0".equals(category.get("PARENTCODE").toString())) )
			{
				parentCatogory = appMapper.SP_TAB_LOV (category.get("PARENTCODE").toString());
			}
			else
			{
				Map<String,Object> temp = new HashMap<>();
				temp.put("ID", 0);
				temp.put("text","No group");
			}
			mav.addObject("parentCatogory", parentCatogory);
			
			return mav;
		}

		@RequestMapping(value = { "/editMasterdata/{id}" }, method = RequestMethod.GET)
		public ModelAndView editExperience(@PathVariable("id") int id) {

			ModelAndView mav = new ModelAndView("component/masterdata/masterdata_edit");
			Map<String,Object> data = appMapper.sp_get_Masterdata_by_id(id);

			List<Map<String,Object>> parentCatogory = new  ArrayList<>();
			if( !("0".equals(data.get("textparent").toString())) )
			{
				parentCatogory = appMapper.SP_TAB_LOV (data.get("textparent").toString());
			}
			else
			{
				Map<String,Object> temp = new HashMap<>();
				temp.put("id", 0);
				temp.put("text","No group");
			}
			mav.addObject("parentCatogory", parentCatogory);
			
			mav.addObject("data", data);

			return mav;
		}
		
		@RequestMapping(value = { "/deleteMasterdata/{id}" }, method = RequestMethod.GET)
		public ModelAndView deleteExperience(@PathVariable("id") int id) {

			ModelAndView mav = new ModelAndView("component/masterdata/masterdata_delete");
			Map<String, Object> information = appMapper.sp_get_Masterdata_by_id(id);
			mav.addObject("data", information);

			return mav;
		}

	
	

}
