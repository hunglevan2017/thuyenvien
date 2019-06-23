package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.SeaThongTinThuyenVien;
import com.saigonbpo.dc.Model.SeaThongTinThuyenVienExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeaThongTinThuyenVienMapper {
    long countByExample(SeaThongTinThuyenVienExample example);

    int deleteByExample(SeaThongTinThuyenVienExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SeaThongTinThuyenVien record);

    int insertSelective(SeaThongTinThuyenVien record);

    List<SeaThongTinThuyenVien> selectByExample(SeaThongTinThuyenVienExample example);

    SeaThongTinThuyenVien selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SeaThongTinThuyenVien record, @Param("example") SeaThongTinThuyenVienExample example);

    int updateByExample(@Param("record") SeaThongTinThuyenVien record, @Param("example") SeaThongTinThuyenVienExample example);

    int updateByPrimaryKeySelective(SeaThongTinThuyenVien record);

    int updateByPrimaryKey(SeaThongTinThuyenVien record);
}