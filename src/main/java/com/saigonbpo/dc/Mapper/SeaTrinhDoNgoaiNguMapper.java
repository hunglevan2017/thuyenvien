package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.SeaTrinhDoNgoaiNgu;
import com.saigonbpo.dc.Model.SeaTrinhDoNgoaiNguExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeaTrinhDoNgoaiNguMapper {
    long countByExample(SeaTrinhDoNgoaiNguExample example);

    int deleteByExample(SeaTrinhDoNgoaiNguExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SeaTrinhDoNgoaiNgu record);

    int insertSelective(SeaTrinhDoNgoaiNgu record);

    List<SeaTrinhDoNgoaiNgu> selectByExample(SeaTrinhDoNgoaiNguExample example);

    SeaTrinhDoNgoaiNgu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SeaTrinhDoNgoaiNgu record, @Param("example") SeaTrinhDoNgoaiNguExample example);

    int updateByExample(@Param("record") SeaTrinhDoNgoaiNgu record, @Param("example") SeaTrinhDoNgoaiNguExample example);

    int updateByPrimaryKeySelective(SeaTrinhDoNgoaiNgu record);

    int updateByPrimaryKey(SeaTrinhDoNgoaiNgu record);
}