package com.bixin.ddd.domain.gateway;

import com.bixin.ddd.domain.userbank.valobj.AuthenticateDTO;

public interface IAuthenticateGateway {

    /**
     * 对银行卡鉴权
     *
     * @param dto
     * @return
     */
    boolean authenticate(AuthenticateDTO dto);
}
