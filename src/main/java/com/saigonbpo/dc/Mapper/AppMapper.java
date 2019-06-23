package com.saigonbpo.dc.Mapper;

import java.util.List;
import java.util.Map;

import com.saigonbpo.dc.Model.MasterData;
import com.saigonbpo.dc.Model.ShortProfileCrew;

public interface AppMapper {

	List<Map<String, Object>> getListOfBoat(Map<String, Object> input);

	List<Map<String, Object>> getListOfBoat_v3(Map<String, Object> input);

	List<ShortProfileCrew> sp_sea_get_profile_user(int crewId);

	List<MasterData> SP_LOV_GET(String code);



}
