package com.bixin.ddd.domain.userbank.service;

import com.alibaba.cola.exception.BizException;
import com.bixin.ddd.domain.gateway.IAuthenticateGateway;
import com.bixin.ddd.domain.userbank.aggregate.UserBank;
import com.bixin.ddd.domain.userbank.factory.UserBankFactory;
import com.bixin.ddd.domain.userbank.repo.IUserBankRepository;
import com.bixin.ddd.domain.userbank.valobj.AuthenticateDTO;
import com.bixin.ddd.domain.userbank.valobj.UserBankBindDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 领域服务
 */
@Service
public class BindService {

    @Autowired
    private IAuthenticateGateway authenticateGateway;

    @Autowired
    private IUserBankRepository IUserBankRepository;

    /**
     * 绑定卡
     *
     * @param dto
     * @return
     */
    public UserBank bind(UserBankBindDTO dto) {
        //因为绑卡依赖了鉴权，所以只能用领域服务。
        boolean authenticate = authenticateGateway.authenticate(AuthenticateDTO.of(dto));
        if (!authenticate) {
            throw new BizException("卡信息校验失败，请修改信息");
        }
        UserBank userBank = IUserBankRepository.save(UserBankFactory.of(dto));
        return userBank;
    }
}
