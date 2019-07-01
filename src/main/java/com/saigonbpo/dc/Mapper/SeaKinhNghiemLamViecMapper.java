package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.SeaKinhNghiemLamViec;
import com.saigonbpo.dc.Model.SeaKinhNghiemLamViecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeaKinhNghiemLamViecMapper {
    long countByExample(SeaKinhNghiemLamViecExample example);

    int deleteByExample(SeaKinhNghiemLamViecExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SeaKinhNghiemLamViec record);

    int insertSelective(SeaKinhNghiemLamViec record);

    List<SeaKinhNghiemLamViec> selectByExample(SeaKinhNghiemLamViecExample example);

    SeaKinhNghiemLamViec selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SeaKinhNghiemLamViec record, @Param("example") SeaKinhNghiemLamViecExample example);

    int updateByExample(@Param("record") SeaKinhNghiemLamViec record, @Param("example") SeaKinhNghiemLamViecExample example);

    int updateByPrimaryKeySelective(SeaKinhNghiemLamViec record);

    int updateByPrimaryKey(SeaKinhNghiemLamViec record);
}