package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.SeaTau;
import com.saigonbpo.dc.Model.SeaTauExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeaTauMapper {
    long countByExample(SeaTauExample example);

    int deleteByExample(SeaTauExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SeaTau record);

    int insertSelective(SeaTau record);

    List<SeaTau> selectByExample(SeaTauExample example);

    SeaTau selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SeaTau record, @Param("example") SeaTauExample example);

    int updateByExample(@Param("record") SeaTau record, @Param("example") SeaTauExample example);

    int updateByPrimaryKeySelective(SeaTau record);

    int updateByPrimaryKey(SeaTau record);
}