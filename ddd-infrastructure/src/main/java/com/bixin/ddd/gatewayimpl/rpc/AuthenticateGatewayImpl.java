package com.bixin.ddd.gatewayimpl.rpc;

import com.bixin.ddd.domain.gateway.IAuthenticateGateway;
import com.bixin.ddd.domain.userbank.valobj.AuthenticateDTO;
import org.springframework.stereotype.Component;

@Component
public class AuthenticateGatewayImpl implements IAuthenticateGateway {

    @Override
    public boolean authenticate(AuthenticateDTO dto) {
        //TODO 对接外界的服务
        return true;
    }
}
