package com.bixin.ddd.domain.withdraworder.aggregate;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WithdrawOrder {
    /**
     * 主键
     */
    private Long id;

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
     * 账户id
     */
    private Long accountId;

    /**
     * 提现成功时间
     */
    private Date successTime;

    /**
     * 作废
     */
    public void invalid() {
        this.state = "INVALID";
    }

    /**
     * 审核通过
     *
     * @param user 审核人
     * @param approveRemark 审核备注
     * @param approveTime 审核时间
     */
    public void approveSuccess(String user, String approveRemark, Date approveTime) {
        this.state = "APPROVE_ACCEPT";
        this.approveUser = user;
        this.approveRemark = approveRemark;
        this.approveTime = approveTime;
    }

    /**
     * 提现成功
     * @param successTime 提现时间
     */
    public void withdrawSuccess(Date successTime) {
        this.state = "SUCCESS";
        this.successTime = successTime;
    }
}