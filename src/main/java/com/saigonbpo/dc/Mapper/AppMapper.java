package com.saigonbpo.dc.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AppMapper {

	List<Map<String, Object>> getListOfBoat(Map<String, Object> input);

	List<Map<String, Object>> getListOfBoat_v3(Map<String, Object> input);



}
