package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.MemberShip;
import com.saigonbpo.dc.Model.MemberShipExample;
import com.saigonbpo.dc.Model.MemberShipWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberShipMapper {
    long countByExample(MemberShipExample example);

    int deleteByExample(MemberShipExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(MemberShipWithBLOBs record);

    int insertSelective(MemberShipWithBLOBs record);

    List<MemberShipWithBLOBs> selectByExampleWithBLOBs(MemberShipExample example);

    List<MemberShip> selectByExample(MemberShipExample example);

    MemberShipWithBLOBs selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") MemberShipWithBLOBs record, @Param("example") MemberShipExample example);

    int updateByExampleWithBLOBs(@Param("record") MemberShipWithBLOBs record, @Param("example") MemberShipExample example);

    int updateByExample(@Param("record") MemberShip record, @Param("example") MemberShipExample example);

    int updateByPrimaryKeySelective(MemberShipWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MemberShipWithBLOBs record);

    int updateByPrimaryKey(MemberShip record);
}