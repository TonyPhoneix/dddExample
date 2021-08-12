package com.bixin.ddd.domain.withdraworder.factory;

import com.bixin.ddd.domain.withdraworder.aggregate.WithdrawOrder;
import com.bixin.ddd.domain.withdraworder.valobj.WithdrawOrderDTO;

public class WithdrawOrderFactory {

    public WithdrawOrder of(WithdrawOrderDTO dto) {
        return WithdrawOrder.builder()
                .userBankId(dto.getUserBankId())
                .targetAmount(dto.getTargetAmount())
                .state("APPLIED")
                .applyUid(dto.getApplyUid())
                .accountId(dto.getAccountUid())
                .successTime(dto.getSuccessTime())
                .build();
    }
}
