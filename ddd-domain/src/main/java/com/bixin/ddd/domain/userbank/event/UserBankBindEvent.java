package com.bixin.ddd.domain.userbank.event;

import com.alibaba.cola.event.DomainEventI;
import lombok.Builder;
import lombok.Data;

/**
 * 用户绑卡事件
 */
@Data
@Builder
public class UserBankBindEvent implements DomainEventI {

    private Long uid;

    private Long bankId;

    public static DomainEventI of(Long uid, Long bankId) {

        return UserBankBindEvent.builder()
                .bankId(bankId)
                .uid(uid)
                .build();
    }
}
