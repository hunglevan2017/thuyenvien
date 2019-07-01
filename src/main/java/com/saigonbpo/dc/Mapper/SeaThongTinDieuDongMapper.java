package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.SeaThongTinDieuDong;
import com.saigonbpo.dc.Model.SeaThongTinDieuDongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeaThongTinDieuDongMapper {
    long countByExample(SeaThongTinDieuDongExample example);

    int deleteByExample(SeaThongTinDieuDongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SeaThongTinDieuDong record);

    int insertSelective(SeaThongTinDieuDong record);

    List<SeaThongTinDieuDong> selectByExample(SeaThongTinDieuDongExample example);

    SeaThongTinDieuDong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SeaThongTinDieuDong record, @Param("example") SeaThongTinDieuDongExample example);

    int updateByExample(@Param("record") SeaThongTinDieuDong record, @Param("example") SeaThongTinDieuDongExample example);

    int updateByPrimaryKeySelective(SeaThongTinDieuDong record);

    int updateByPrimaryKey(SeaThongTinDieuDong record);
}