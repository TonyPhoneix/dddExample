package com.bixin.ddd.converter;

import com.bixin.ddd.domain.userbank.valobj.UserBankBindDTO;
import com.bixin.ddd.domain.userbank.valobj.UserBankModifyDTO;
import com.bixin.ddd.response.UserBankInfo;
import com.bixin.ddd.gatewayimpl.database.dataobject.UserBankDO;
import com.bixin.ddd.request.UserBankBindRequest;
import com.bixin.ddd.request.UserBankModifyRequest;

public class Converter {

    public static UserBankBindDTO of(UserBankBindRequest cmd) {
        return new UserBankBindDTO();
    }

    public static UserBankModifyDTO of(UserBankModifyRequest cmd) {
        return new UserBankModifyDTO();
    }

    public static UserBankInfo of(UserBankDO ub) {
        return UserBankInfo.builder()
                .id(ub.getId())
                .bankId(ub.getBankId())
                .userId(ub.getUserId())
                .uid(ub.getUid())
                .bankName(ub.getBankName())
                .bankCardNo(ub.getBankCardNo())
                .bankCity(ub.getBankCity())
                .branchBank(ub.getBranchBank())
                .bankHolder(ub.getBankHolder())
                .fundChannel(ub.getFundChannel())
                .state(ub.getState())
                .build();
    }
}
