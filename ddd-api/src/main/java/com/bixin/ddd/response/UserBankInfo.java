package com.bixin.ddd.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserBankInfo {
    /**
     * id
     */
    private Long id;

    /**
     * 业务主键
     */
    private String bankId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户uid
     */
    private Long uid;

    /**
     * 银行名字
     */
    private String bankName;

    /**
     * 银行卡号
     */
    private String bankCardNo;

    /**
     * 开户地
     */
    private String bankCity;

    /**
     * 支行
     */
    private String branchBank;

    /**
     * 银行开户名
     */
    private String bankHolder;

    /**
     * 资金渠道
     */
    private String fundChannel;

    /**
     * 状态
     */
    private String state;
}
