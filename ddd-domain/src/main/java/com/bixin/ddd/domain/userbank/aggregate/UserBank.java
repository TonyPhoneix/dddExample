package com.bixin.ddd.domain.userbank.aggregate;

import com.bixin.ddd.domain.userbank.valobj.UserBankModifyDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 用户银行卡
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserBank {
    /**
     * id
     */
    private Long id;

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
     * 状态  VALID:有效，INVALID：无效
     */
    private String state;

    /**
     * 鉴权标识: 0-未鉴权,1-已鉴权
     */
    private Integer flag;

    /**
     * 修改卡信息
     *
     * @param modifyDTO
     */
    public void modify(UserBankModifyDTO modifyDTO) {
        this.bankCardNo = modifyDTO.getBankCardNo();
        this.bankCity = modifyDTO.getBankCity();
        this.bankHolder = modifyDTO.getBankHolder();
        this.bankName = modifyDTO.getBankName();
        this.branchBank = modifyDTO.getBranchBank();
    }

    /**
     * 解绑
     */
    public void unbind() {
        this.state = "INVALID";
    }

    /**
     * 校验成功
     *
     * @param
     */
    public void authenticateSuccess() {
        this.flag = 1;
    }
}