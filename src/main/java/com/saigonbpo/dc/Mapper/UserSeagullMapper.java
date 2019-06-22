package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.UserSeagull;
import com.saigonbpo.dc.Model.UserSeagullExample;
import com.saigonbpo.dc.Model.UserSeagullWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSeagullMapper {
    long countByExample(UserSeagullExample example);

    int deleteByExample(UserSeagullExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(UserSeagullWithBLOBs record);

    int insertSelective(UserSeagullWithBLOBs record);

    List<UserSeagullWithBLOBs> selectByExampleWithBLOBs(UserSeagullExample example);

    List<UserSeagull> selectByExample(UserSeagullExample example);

    UserSeagullWithBLOBs selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") UserSeagullWithBLOBs record, @Param("example") UserSeagullExample example);

    int updateByExampleWithBLOBs(@Param("record") UserSeagullWithBLOBs record, @Param("example") UserSeagullExample example);

    int updateByExample(@Param("record") UserSeagull record, @Param("example") UserSeagullExample example);

    int updateByPrimaryKeySelective(UserSeagullWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserSeagullWithBLOBs record);

    int updateByPrimaryKey(UserSeagull record);
}