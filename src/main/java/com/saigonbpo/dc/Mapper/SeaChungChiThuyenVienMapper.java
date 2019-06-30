package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.SeaChungChiThuyenVien;
import com.saigonbpo.dc.Model.SeaChungChiThuyenVienExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeaChungChiThuyenVienMapper {
    long countByExample(SeaChungChiThuyenVienExample example);

    int deleteByExample(SeaChungChiThuyenVienExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SeaChungChiThuyenVien record);

    int insertSelective(SeaChungChiThuyenVien record);

    List<SeaChungChiThuyenVien> selectByExample(SeaChungChiThuyenVienExample example);

    SeaChungChiThuyenVien selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SeaChungChiThuyenVien record, @Param("example") SeaChungChiThuyenVienExample example);

    int updateByExample(@Param("record") SeaChungChiThuyenVien record, @Param("example") SeaChungChiThuyenVienExample example);

    int updateByPrimaryKeySelective(SeaChungChiThuyenVien record);

    int updateByPrimaryKey(SeaChungChiThuyenVien record);
}