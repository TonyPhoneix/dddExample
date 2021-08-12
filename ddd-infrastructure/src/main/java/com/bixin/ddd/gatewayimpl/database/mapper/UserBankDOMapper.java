package com.bixin.ddd.gatewayimpl.database.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.bixin.ddd.gatewayimpl.database.dataobject.UserBankDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserBankDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserBankDO record);

    int insertOrUpdate(UserBankDO record);

    int insertOrUpdateSelective(UserBankDO record);

    int insertSelective(UserBankDO record);

    UserBankDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserBankDO record);

    int updateByPrimaryKey(UserBankDO record);

    List<UserBankDO> selectAllByUid(@Param("uid")Long uid);
}