package com.bixin.ddd.domain.userbank.service;

import com.alibaba.cola.exception.BizException;
import com.bixin.ddd.domain.gateway.IAuthenticateGateway;
import com.bixin.ddd.domain.userbank.aggregate.UserBank;
import com.bixin.ddd.domain.userbank.repo.IUserBankRepository;
import com.bixin.ddd.domain.userbank.valobj.AuthenticateDTO;
import com.bixin.ddd.domain.userbank.valobj.UserBankModifyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModifyService {

    @Autowired
    private IAuthenticateGateway authenticateGateway;

    @Autowired
    private IUserBankRepository userBankRepository;

    /**
     * 修改卡信息
     *
     * @param dto
     * @return
     */
    public UserBank modify(UserBankModifyDTO dto) {
        //因为绑卡依赖了鉴权，所以只能用领域服务。
        UserBank userBank = userBankRepository.findById(dto.getId())
                .orElseThrow(() -> new BizException("银行卡不存在"));
        boolean authenticate = authenticateGateway.authenticate(AuthenticateDTO.of(dto));
        if (!authenticate) {
            throw new BizException("卡信息校验失败，请修改信息");
        }
        userBank.modify(dto);
        userBank.authenticateSuccess();
        return userBankRepository.save(userBank);
    }
}
