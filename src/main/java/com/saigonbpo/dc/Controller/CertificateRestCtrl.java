package com.saigonbpo.dc.Controller;

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
import com.saigonbpo.dc.Mapper.SeaChungChiThuyenVienMapper;
import com.saigonbpo.dc.Mapper.SeaFileMapper;
import com.saigonbpo.dc.Mapper.TabLovMapper;
import com.saigonbpo.dc.Model.Lov;
import com.saigonbpo.dc.Model.SeaChungChiThuyenVien;
import com.saigonbpo.dc.Model.SeaFile;
import com.saigonbpo.dc.Model.TabLov;
import com.saigonbpo.dc.Model.TabLovExample;


@RestController
public class CertificateRestCtrl {
	
	@Autowired
	AppMapper appMapper;
	
	
	@Autowired
	SeaChungChiThuyenVienMapper seaChungChiThuyenVienMapper;
	
	@Autowired
	SeaFileMapper seaFileMapper;
	
	@Autowired
	TabLovMapper tabLovMapper;
	
	Logger logger = LoggerFactory.getLogger(CertificateRestCtrl.class);
	

	@RequestMapping(value = { "/crew/certificate/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Map<String,Object>> certificate(@PathVariable("id") String crewId) {
		
		List<Map<String,Object>> result =  appMapper.sp_get_certificate(crewId);
		result.remove(result.size()-1);
		return result;
	}
	
	@RequestMapping(value = { "/crew/getCertificatesNotExist/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Lov> getCertificatesNotExist(@PathVariable("id") int crewId) {
		return appMapper.getCertificatesNotExist(crewId);
	}
	
	@RequestMapping(value = { "crew/getCertificateById/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaChungChiThuyenVien getCertificate(@PathVariable("id") int SeaChungChiThuyenVienID) {
		

		SeaChungChiThuyenVien seaChungChiThuyenVien = new SeaChungChiThuyenVien();
		try
		{
			if( SeaChungChiThuyenVienID == 0 )
				return seaChungChiThuyenVien;
			seaChungChiThuyenVien = seaChungChiThuyenVienMapper.selectByPrimaryKey(SeaChungChiThuyenVienID);
			logger.info(seaChungChiThuyenVien.getTenchungchival()+"");
			TabLovExample example = new TabLovExample();
			example.createCriteria().andValueEqualTo(seaChungChiThuyenVien.getTenchungchival()+"").andCodeEqualTo("TV001").andIdIsNotNull();
			TabLov tablov = tabLovMapper.selectByExample(example).get(0);
			String tenchungchi = tablov.getText();
			seaChungChiThuyenVien.setTenchungchi(tenchungchi);
			return seaChungChiThuyenVien;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = { "crew/getFile/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaFile getFile(@PathVariable("id") int id) {
		return seaFileMapper.selectByPrimaryKey(id);
	}
	
	@RequestMapping(value = { "/saveCertificate" }, method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public SeaChungChiThuyenVien saveCertificate(@RequestBody SeaChungChiThuyenVien record) {
		
		try
		{
			if(record.getId() == null )
				seaChungChiThuyenVienMapper.insertSelective(record);
			else
				seaChungChiThuyenVienMapper.updateByPrimaryKeySelective(record);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		return record;
	}
	
	@RequestMapping(value = { "/removeCertificate/{id}" }, method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean removeCertificat(@PathVariable("id") int SeaChungChiThuyenVienID) {
		try
		{
				seaChungChiThuyenVienMapper.deleteByPrimaryKey(SeaChungChiThuyenVienID);
				return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	
	}
	
}
