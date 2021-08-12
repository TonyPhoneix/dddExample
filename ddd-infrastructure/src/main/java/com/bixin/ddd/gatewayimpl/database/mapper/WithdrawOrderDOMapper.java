package com.bixin.ddd.gatewayimpl.database.mapper;

import com.bixin.ddd.gatewayimpl.database.dataobject.WithdrawOrderDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WithdrawOrderDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WithdrawOrderDO record);

    int insertSelective(WithdrawOrderDO record);

    WithdrawOrderDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WithdrawOrderDO record);

    int updateByPrimaryKey(WithdrawOrderDO record);
}