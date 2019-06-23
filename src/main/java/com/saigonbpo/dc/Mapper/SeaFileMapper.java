package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.SeaFile;
import com.saigonbpo.dc.Model.SeaFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeaFileMapper {
    long countByExample(SeaFileExample example);

    int deleteByExample(SeaFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SeaFile record);

    int insertSelective(SeaFile record);

    List<SeaFile> selectByExampleWithBLOBs(SeaFileExample example);

    List<SeaFile> selectByExample(SeaFileExample example);

    SeaFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SeaFile record, @Param("example") SeaFileExample example);

    int updateByExampleWithBLOBs(@Param("record") SeaFile record, @Param("example") SeaFileExample example);

    int updateByExample(@Param("record") SeaFile record, @Param("example") SeaFileExample example);

    int updateByPrimaryKeySelective(SeaFile record);

    int updateByPrimaryKeyWithBLOBs(SeaFile record);

    int updateByPrimaryKey(SeaFile record);
}