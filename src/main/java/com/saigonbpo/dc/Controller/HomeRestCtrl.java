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

import com.saigonbpo.dc.Mapper.AppMapper;

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
	@RequestMapping(value = { "/ListOfBoatFollowState/{tinhtrangdieudong}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> ListOfBoatFollowState(@PathVariable("tinhtrangdieudong") int tinhtrangdieudong) {

		logger.info("ListOfBoatFollowState");
		// Input
		Map<String, Object> Input = new HashMap<>();
		List<Map<String, Object>> ListOfCrew = new ArrayList<>();

		if (tinhtrangdieudong >= 0) {
			// 1 is on leave
			// 0 is onboard
			Input.put("tinhtrangdieudong", tinhtrangdieudong);

			// Call Service
			ListOfCrew = appMapper.getListOfBoat(Input);
		} else if (tinhtrangdieudong == -2) {

			// Total
			Input.put("tinhtrangdieudong", null);
			logger.info(""+Input);
			
			ListOfCrew = appMapper.getListOfBoat_v3(Input);

			for (Iterator<Map<String, Object>> iter = ListOfCrew.iterator(); iter.hasNext();) {
				Map<String, Object> map = iter.next();
				Object c_id = map.get("trangthaiId").toString();
				if (c_id.equals("-2"))
					iter.remove();
			}

		} else if (tinhtrangdieudong == -1) {
			// Applicant
			Input.put("trangthaiId", 0);
			ListOfCrew = appMapper.getListOfBoat_v3(Input);
		} else if (tinhtrangdieudong == -3) {
			// Resign
			Input.put("trangthaiId", -2);
			ListOfCrew = appMapper.getListOfBoat_v3(Input);
		}

		logger.info("ListOfCrew:" + ListOfCrew.size());

		return ListOfCrew;

	}
	


}
