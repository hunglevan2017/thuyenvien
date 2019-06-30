package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.SeaTrinhDoViTinh;
import com.saigonbpo.dc.Model.SeaTrinhDoViTinhExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeaTrinhDoViTinhMapper {
    long countByExample(SeaTrinhDoViTinhExample example);

    int deleteByExample(SeaTrinhDoViTinhExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SeaTrinhDoViTinh record);

    int insertSelective(SeaTrinhDoViTinh record);

    List<SeaTrinhDoViTinh> selectByExample(SeaTrinhDoViTinhExample example);

    SeaTrinhDoViTinh selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SeaTrinhDoViTinh record, @Param("example") SeaTrinhDoViTinhExample example);

    int updateByExample(@Param("record") SeaTrinhDoViTinh record, @Param("example") SeaTrinhDoViTinhExample example);

    int updateByPrimaryKeySelective(SeaTrinhDoViTinh record);

    int updateByPrimaryKey(SeaTrinhDoViTinh record);
}