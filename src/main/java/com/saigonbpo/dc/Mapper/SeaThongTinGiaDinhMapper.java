package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.SeaThongTinGiaDinh;
import com.saigonbpo.dc.Model.SeaThongTinGiaDinhExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeaThongTinGiaDinhMapper {
    long countByExample(SeaThongTinGiaDinhExample example);

    int deleteByExample(SeaThongTinGiaDinhExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SeaThongTinGiaDinh record);

    int insertSelective(SeaThongTinGiaDinh record);

    List<SeaThongTinGiaDinh> selectByExample(SeaThongTinGiaDinhExample example);

    SeaThongTinGiaDinh selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SeaThongTinGiaDinh record, @Param("example") SeaThongTinGiaDinhExample example);

    int updateByExample(@Param("record") SeaThongTinGiaDinh record, @Param("example") SeaThongTinGiaDinhExample example);

    int updateByPrimaryKeySelective(SeaThongTinGiaDinh record);

    int updateByPrimaryKey(SeaThongTinGiaDinh record);
}