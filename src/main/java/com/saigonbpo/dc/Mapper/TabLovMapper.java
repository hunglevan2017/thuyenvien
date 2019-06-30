package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.TabLov;
import com.saigonbpo.dc.Model.TabLovExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabLovMapper {
    long countByExample(TabLovExample example);

    int deleteByExample(TabLovExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TabLov record);

    int insertSelective(TabLov record);

    List<TabLov> selectByExample(TabLovExample example);

    TabLov selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TabLov record, @Param("example") TabLovExample example);

    int updateByExample(@Param("record") TabLov record, @Param("example") TabLovExample example);

    int updateByPrimaryKeySelective(TabLov record);

    int updateByPrimaryKey(TabLov record);
}