package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.SeaThongTinChucDanh;
import com.saigonbpo.dc.Model.SeaThongTinChucDanhExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeaThongTinChucDanhMapper {
    long countByExample(SeaThongTinChucDanhExample example);

    int deleteByExample(SeaThongTinChucDanhExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SeaThongTinChucDanh record);

    int insertSelective(SeaThongTinChucDanh record);

    List<SeaThongTinChucDanh> selectByExample(SeaThongTinChucDanhExample example);

    SeaThongTinChucDanh selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SeaThongTinChucDanh record, @Param("example") SeaThongTinChucDanhExample example);

    int updateByExample(@Param("record") SeaThongTinChucDanh record, @Param("example") SeaThongTinChucDanhExample example);

    int updateByPrimaryKeySelective(SeaThongTinChucDanh record);

    int updateByPrimaryKey(SeaThongTinChucDanh record);

	SeaThongTinChucDanh getChucDanhHienTai(int crewID);
}