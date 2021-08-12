package com.bixin.ddd.domain.userbank.valobj;

import lombok.Data;

@Data
public class UserBankBindDTO {

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
}
