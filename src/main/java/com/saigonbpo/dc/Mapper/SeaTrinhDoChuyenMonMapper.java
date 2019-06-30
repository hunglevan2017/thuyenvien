package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.SeaTrinhDoChuyenMon;
import com.saigonbpo.dc.Model.SeaTrinhDoChuyenMonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeaTrinhDoChuyenMonMapper {
    long countByExample(SeaTrinhDoChuyenMonExample example);

    int deleteByExample(SeaTrinhDoChuyenMonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SeaTrinhDoChuyenMon record);

    int insertSelective(SeaTrinhDoChuyenMon record);

    List<SeaTrinhDoChuyenMon> selectByExample(SeaTrinhDoChuyenMonExample example);

    SeaTrinhDoChuyenMon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SeaTrinhDoChuyenMon record, @Param("example") SeaTrinhDoChuyenMonExample example);

    int updateByExample(@Param("record") SeaTrinhDoChuyenMon record, @Param("example") SeaTrinhDoChuyenMonExample example);

    int updateByPrimaryKeySelective(SeaTrinhDoChuyenMon record);

    int updateByPrimaryKey(SeaTrinhDoChuyenMon record);
}