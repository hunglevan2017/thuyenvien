package com.saigonbpo.dc.Controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.saigonbpo.dc.Mapper.AppMapper;
import com.saigonbpo.dc.Mapper.SeaFileMapper;
import com.saigonbpo.dc.Mapper.SeaThongTinThuyenVienMapper;
import com.saigonbpo.dc.Model.FullProfileCrew;
import com.saigonbpo.dc.Model.ResResult;
import com.saigonbpo.dc.Model.SeaFile;
import com.saigonbpo.dc.Model.SeaThongTinThuyenVien;
import com.saigonbpo.dc.Model.ShortProfileCrew;

import javafx.scene.media.Media;

@RestController
public class ThongTinGiaDinhRestCtrl {
	
	@Autowired
	AppMapper appMapper;
	
	@Autowired
	SeaThongTinThuyenVienMapper seaThongTinThuyenVienMapper;
	
	@Autowired
	SeaFileMapper seaFileMapper;

	@RequestMapping(value = { "/crew/thongtingiadinh/{id}" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Map<String,Object>> thongtingiadinh(@PathVariable("id") int crewId) {
		
		return appMapper.sp_get_thongtingiadinh(crewId);
	}


}
