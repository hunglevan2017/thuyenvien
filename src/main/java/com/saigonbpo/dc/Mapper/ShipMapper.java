package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.Ship;
import com.saigonbpo.dc.Model.ShipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipMapper {
    long countByExample(ShipExample example);

    int deleteByExample(ShipExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ship record);

    int insertSelective(Ship record);

    List<Ship> selectByExample(ShipExample example);

    Ship selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ship record, @Param("example") ShipExample example);

    int updateByExample(@Param("record") Ship record, @Param("example") ShipExample example);

    int updateByPrimaryKeySelective(Ship record);

    int updateByPrimaryKey(Ship record);
}