package com.bixin.ddd.gatewayimpl.database.dataobject;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WithdrawOrderDO {
    /**
    * 自增主键
    */
    private Long id;

    /**
    * 提现ID 业务主键
    */
    private String withdrawId;

    /**
    * 账户ID
    */
    private String accountId;

    /**
    * 申请用户ID
    */
    private String applyUserId;

    /**
    * 账户类型 USER=普通用户 UNION=工会
    */
    private String accountType;

    /**
    * 提现金额(元)
    */
    private BigDecimal targetAmount;

    /**
    * ASSET 提现货币类型
    */
    private String source;

    /**
    * 提现数量
    */
    private BigDecimal sourceAmount;

    /**
    * 费率
    */
    private String rate;

    /**
    * 手续费：资产数量
    */
    private BigDecimal rateAmount;

    /**
    * 到账金额
    */
    private BigDecimal arriveAmount;

    /**
    * INVALID=作废 APPLIED=已申请 APPROVE_ACCEPT=审核通过 APPROVE_REFUSE=审核拒绝 PAY_FAILED_WITHOUT_REFUND=打款失败没有退款 SUCCESS=打款成功 PAY_FAILED_REFUND=打款失败后给用户退款 PAY_FAILED_BANK_REFUND=银行录入失败退回用户
    */
    private String state;

    /**
    * 开户银行名字
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
    * 开户银行开户名
    */
    private String bankAccountHolder;

    /**
    * 资金渠道, 默认为治衡出款渠道
    */
    private String fundChannel;

    /**
    * 审核人
    */
    private String approveUser;

    /**
    * 审核情况备注
    */
    private String approveRemark;

    /**
    * 审核时间
    */
    private Date approveTime;

    /**
    * 打款人
    */
    private String remitUser;

    /**
    * 打款情况备注
    */
    private String remitRemark;

    /**
    * 打款日期
    */
    private Date remitTime;

    /**
    * 备注
    */
    private String remark;

    /**
    * APP
    */
    private String app;

    /**
    * 申请用户uid
    */
    private Long applyUid;

    /**
    * 账户uid
    */
    private Long accountUid;

    /**
    * 提现账期(单位：小时)
    */
    private Integer period;

    /**
    * 新余额标识,0-旧余额 1:新余额
    */
    private Integer amountType;

    /**
    * 出款公司简称
    */
    private String companyCode;

    /**
    * 风控拦截标识,0:否 1:是
    */
    private Integer flag;

    /**
    * 新旧订单标识 0-旧 1-新
    */
    private Integer orderType;

    /**
    * 退款时间
    */
    private Date refundTime;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 失败文案备注
    */
    private String remitOuterRemark;

    /**
    * 业务类型
    */
    private String bizType;
}