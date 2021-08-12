package com.bixin.ddd.domain.userbank.factory;

import com.bixin.ddd.domain.userbank.aggregate.UserBank;
import com.bixin.ddd.domain.userbank.valobj.UserBankBindDTO;

public class UserBankFactory {

    public static UserBank of(UserBankBindDTO userBankBindDTO) {
        return UserBank.builder()
                .uid(userBankBindDTO.getUid())
                .bankName(userBankBindDTO.getBankName())
                .bankCardNo(userBankBindDTO.getBankCardNo())
                .bankCity(userBankBindDTO.getBankCity())
                .branchBank(userBankBindDTO.getBranchBank())
                .bankHolder(userBankBindDTO.getBankHolder())
                .state("VALID")
                .flag(0)
                .build();
    }
}
