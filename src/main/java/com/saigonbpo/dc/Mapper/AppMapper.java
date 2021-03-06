package com.saigonbpo.dc.Mapper;

import java.util.List;
import java.util.Map;

import com.saigonbpo.dc.Model.Lov;
import com.saigonbpo.dc.Model.MasterData;
import com.saigonbpo.dc.Model.ShortProfileCrew;

public interface AppMapper {

	List<Map<String, Object>> getListOfBoat(Map<String, Object> input);

	List<Map<String, Object>> getListOfBoat_v3(Map<String, Object> input);

	List<ShortProfileCrew> sp_sea_get_profile_user(int crewId);

	List<MasterData> SP_LOV_GET(String code);

	List<Map<String, Object>> sp_get_thongtingiadinh(int crewId);

	List<Map<String, Object>> sp_get_trinhdochuyenmon(int crewId);

	List<Map<String, Object>> sp_get_trinhdongoaingu(int crewId);

	List<Map<String, Object>> sp_get_trinhdovitinh(int crewId);

	List<Map<String, Object>> sp_get_certificate(String crewId);

	List<Lov> getCertificatesNotExist(int crewId);

	List<Map<String, Object>> queryKinhNghiemLamviec(String crewId);

	List<Map<String, Object>> queryKinhNghiemLamviecOther(String crewId);

	List<Map<String, Object>> sp_sea_get_profile_user(Map<String, Object> filter);

	List<Map<String, Object>> SP_Boatman_Position_Search(int crewId);

	List<Map<String, Object>> getMainCertificateCrew(Map<String, Object> filter);

	Map<String, Object> sp_get_info_crew(Map<String, Object> filter);

	Map<String, Object> getSeamanBook(Map<String, Object> filter);

	List<Map<String, Comparable>> SP_DieuDong_Search(String thuyenvienid);

	List<Map<String, Object>> SP_Kinh_Nghiem_Lam_Viec(String thuyenvienid);

	List<Map<String, Object>> getListOfBoat_4(Map<String, Object> input);

	Map<String, Object> get_SP_Get_statistical_DashBoard(Map<String, Object> input);

	List<Map<String, Object>> sp_statistic_ship(Map<String, Object> input);

	List<Map<String, Object>> sp_statistic_department(Map<String, Object> input);

	List<Map<String, Object>> sp_get_ship();

	List<Map<String, Object>> sp_tab_department();

	Map<String, Object> SP_TAB_LOV_CAT_GETPARENTCODE(String code);

	List<Map<String, Object>> SP_TAB_LOV(String string);

	Map<String, Object> sp_get_Masterdata_by_id(int id);

	void add_masterdata(Map<String, Object> condition);

	void edit_masterdata(Map<String, Object> condition);

	void delete_masterdata(Map<String, Object> condition);



}
