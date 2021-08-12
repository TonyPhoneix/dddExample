package com.bixin.ddd.gatewayimpl.database.dataobject;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 用户银行卡信息表
 */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserBankDO {
    /**
     * 自增长主键，业务无关
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

    /**
     * 鉴权标识: 0-未鉴权,1-已鉴权
     */
    private Integer flag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}