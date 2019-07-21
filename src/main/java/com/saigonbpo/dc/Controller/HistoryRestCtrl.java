package com.saigonbpo.dc.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.saigonbpo.dc.Mapper.AppMapper;
import com.saigonbpo.dc.Mapper.SeaTauMapper;
import com.saigonbpo.dc.Mapper.SeaThongTinChucDanhMapper;
import com.saigonbpo.dc.Mapper.SeaThongTinDieuDongMapper;
import com.saigonbpo.dc.Mapper.SeaThongTinThuyenVienMapper;
import com.saigonbpo.dc.Model.SeaTau;
import com.saigonbpo.dc.Model.SeaTauExample;
import com.saigonbpo.dc.Model.SeaThongTinChucDanh;
import com.saigonbpo.dc.Model.SeaThongTinDieuDong;
import com.saigonbpo.dc.Model.SeaThongTinThuyenVien;

@Controller
public class HistoryRestCtrl {
	
	@Autowired
	AppMapper appMapper;
	
	@Autowired
	SeaTauMapper seaTauMapper;
	
	@Autowired
	SeaThongTinChucDanhMapper seaThongTinChucDanhMapper;
	
	@Autowired
	SeaThongTinDieuDongMapper seaThongTinDieuDongMapper;
	
	@Autowired
	SeaThongTinThuyenVienMapper seaThongTinThuyenVienMapper;
	
	@RequestMapping(value = { "/history/{thuyenvienid}" }, method = RequestMethod.GET)
	public ModelAndView History( @PathVariable("thuyenvienid") String thuyenvienid ) {

		ModelAndView mav = new ModelAndView("component/history");
		List<Map<String, Comparable>> result =  appMapper.SP_DieuDong_Search(thuyenvienid);
		List<Map<String, Object>> result1 =  appMapper.SP_Kinh_Nghiem_Lam_Viec(thuyenvienid);
		
		
		if (result != null)
			result.remove(result.size() - 1);

	
		Collections.sort(result, new Comparator<Map<String, Comparable>> () {

		    @Override
		    public int compare(Map<String, Comparable> m1, Map<String, Comparable> m2) {
		        return m2.get("id").compareTo(m1.get("id")); //descending
		    }
		});

	
		List<Map<String, Comparable>> resultt =  new ArrayList<>();
		
		for(int i=0;i<result.size();i++)
		{
			
			if(result.get(i).get("chucdanhht")!=null && result.get(i).get("chucdanhtext")!=null)
			{
				resultt.add(result.get(i));
			}
			
			
		}
		
		

		mav.addObject("list_history", resultt);
		mav.addObject("size_history", resultt.size()+1);
		
		mav.addObject("list_history1", result1);
		return mav;
	}
	
	
	
}
