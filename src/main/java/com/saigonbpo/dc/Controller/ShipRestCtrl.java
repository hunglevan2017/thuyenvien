package com.saigonbpo.dc.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saigonbpo.dc.Mapper.AppMapper;
import com.saigonbpo.dc.Mapper.SeaThongTinChucDanhMapper;
import com.saigonbpo.dc.Mapper.ShipMapper;
import com.saigonbpo.dc.Mapper.TabLovMapper;
import com.saigonbpo.dc.Model.MasterData;
import com.saigonbpo.dc.Model.SeaThongTinChucDanh;
import com.saigonbpo.dc.Model.Ship;
import com.saigonbpo.dc.Model.ShipExample;


@RestController
public class ShipRestCtrl {
	
	@Autowired
	AppMapper appMapper;
		
	@Autowired
	ShipMapper shipMapper;
	
	@Autowired
	TabLovMapper tabLovMapper;
	
	Logger logger = LoggerFactory.getLogger(ShipRestCtrl.class);
	


	@RequestMapping(value = { "/ship" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Ship> getAllShip() {

		ShipExample example = new ShipExample();
		example.createCriteria();
		List<MasterData> masterdatas = appMapper.SP_LOV_GET("T001");
	
		List<Ship> ships = shipMapper.selectByExample(example);
		List<Ship> result = new ArrayList<Ship>();
		for (Ship tmp : ships) {
			for (MasterData masterData : masterdatas) {
				if( tmp.getLoaitauid().equals(masterData.getVal()) )
				{
					tmp.setLoaitauid(masterData.getTEXT());
					result.add(tmp);
				}
			}
		}
			
		return result;
		
	}
	
	@RequestMapping(value = { "ship/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Ship getRank(@PathVariable("id") int ShipID) {
		

		Ship record = new Ship();
		try
		{
			if( ShipID == 0 )
				return record;
			return shipMapper.selectByPrimaryKey(ShipID);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = { "/saveShip" }, method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public Ship saveShip(@RequestBody Ship record) {
		try
		{
			if(record.getId() == null )
				shipMapper.insertSelective(record);
			else
				shipMapper.updateByPrimaryKeySelective(record);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		return record;
	}
	
	@RequestMapping(value = { "/removeShip/{id}" }, method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean removeShip(@PathVariable("id") int shipID) {
		try
		{
				shipMapper.deleteByPrimaryKey(shipID);
				return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	
	}
	
	
}
