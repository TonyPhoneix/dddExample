package com.bixin.ddd.domain.withdraworder.valobj;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class WithdrawOrderDTO {

    /**
     * 提现卡号id
     */
    private Long userBankId;

    /**
     * 提现金额(元)
     */
    private BigDecimal targetAmount;


    /**
     * INVALID=作废 APPLIED=已申请 APPROVE_ACCEPT=审核通过 APPROVE_REFUSE=审核拒绝 PAY_FAILED_WITHOUT_REFUND=打款失败没有退款 SUCCESS=打款成功 PAY_FAILED_REFUND=打款失败后给用户退款 PAY_FAILED_BANK_REFUND=银行录入失败退回用户
     */
    private String state;

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
     * 申请用户uid
     */
    private Long applyUid;

    /**
     * 账户uid
     */
    private Long accountUid;

    /**
     * 提现成功时间
     */
    private Date successTime;
}
