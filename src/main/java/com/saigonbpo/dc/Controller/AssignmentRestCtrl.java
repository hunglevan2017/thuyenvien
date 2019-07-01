package com.saigonbpo.dc.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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


@RestController
public class AssignmentRestCtrl {
	
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
	
	
	@RequestMapping(value = { "ships" }, method = RequestMethod.GET)
	public List<SeaTau> getShips(){
		
		SeaTauExample example = new SeaTauExample();
		example.createCriteria().andIsactiveEqualTo(true);
		return seaTauMapper.selectByExample(example);
	}
	
	@RequestMapping(value = { "/loadCrewOnShip/{tauid}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> loadCrewOnShip(@PathVariable("tauid") int tauid) {
		List<Map<String, Object>> result = seaTauMapper.loadCrewOnShip(tauid);
		if (result != null)
			result.remove(result.size() - 1);
		return result;
	}

	@RequestMapping(value = { "/loadTVDuTru/{tauid}" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Map<String, Object>> loadTVDuTru(@PathVariable("tauid") int tauid) {
		List<Map<String, Object>> result = seaTauMapper.loadTVDuTru(tauid);
		if (result != null)
			result.remove(result.size() - 1);
		List<Map<String, Object>> arrs = new ArrayList();
		for (Map<String, Object> map : result) {
			if ("0".equals(map.get("tinhtrangdieudong").toString())) {
					arrs.add(map);
			}
		}
		return arrs;
	}
	

	@RequestMapping(value = { "crew/dieudongById/{id}/{crewID}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaThongTinDieuDong getDieuDong(@PathVariable("id") int SeaThongTinDieuDongID,@PathVariable("crewID") int crewID) {

		SeaThongTinChucDanh seaThongTinChucDanh = seaThongTinChucDanhMapper.getChucDanhHienTai(crewID);
		SeaThongTinDieuDong seaThongTinDieuDong = new SeaThongTinDieuDong();
		
		
		if(seaThongTinChucDanh!=null)
		{
			seaThongTinDieuDong.setHoten(seaThongTinChucDanh.getHoten());
			seaThongTinDieuDong.setNgaydamnhan(seaThongTinChucDanh.getNgaydamnhan());
			seaThongTinDieuDong.setTenchucdanh(seaThongTinChucDanh.getTenchucdanh());
			seaThongTinDieuDong.setThuyenvienid(seaThongTinChucDanh.getThuyenvienid());
		}
		try
		{
			if( SeaThongTinDieuDongID == 0 )
				return seaThongTinDieuDong;
			
			seaThongTinDieuDong = seaThongTinDieuDongMapper.selectByPrimaryKey(SeaThongTinDieuDongID);
			seaThongTinDieuDong.setHoten(seaThongTinChucDanh.getHoten());
			seaThongTinDieuDong.setNgaydamnhan(seaThongTinChucDanh.getNgaydamnhan());
			seaThongTinDieuDong.setTenchucdanh(seaThongTinChucDanh.getTenchucdanh());
			seaThongTinDieuDong.setThuyenvienid(seaThongTinChucDanh.getThuyenvienid());
			
			
			return seaThongTinDieuDong;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
	
	
	@RequestMapping(value = { "/saveDieuDong" }, method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaThongTinDieuDong saveDieuDong(@RequestBody SeaThongTinDieuDong record) {

		try
		{
			if(record.getId() == null )
				seaThongTinDieuDongMapper.insertSelective(record);
			else
				seaThongTinDieuDongMapper.updateByPrimaryKeySelective(record);
			
			SeaThongTinThuyenVien seaThongTinThuyenVien = seaThongTinThuyenVienMapper.selectByPrimaryKey(record.getThuyenvienid());
			seaThongTinThuyenVien.setTinhtrangdieudong(1);
			seaThongTinThuyenVienMapper.updateByPrimaryKeySelective(seaThongTinThuyenVien);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		return record;
	}

	@RequestMapping(value = { "/removeDieuDong/{id}" }, method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean removeDieuDong(@PathVariable("id") int SeaThongTinDieuDongID) {
		try
		{
			SeaThongTinDieuDong seaThongTinDieuDong = seaThongTinDieuDongMapper.selectByPrimaryKey(SeaThongTinDieuDongID);
				seaThongTinDieuDongMapper.deleteByPrimaryKey(SeaThongTinDieuDongID);
				
				
				
				SeaThongTinThuyenVien seaThongTinThuyenVien = seaThongTinThuyenVienMapper.selectByPrimaryKey(seaThongTinDieuDong.getThuyenvienid());
				seaThongTinThuyenVien.setTinhtrangdieudong(0);
				seaThongTinThuyenVienMapper.updateByPrimaryKeySelective(seaThongTinThuyenVien);
				
				
				return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}

	}
	
	
	
}
