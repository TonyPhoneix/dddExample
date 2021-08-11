package com.bixin.ddd.command;

import com.alibaba.cola.dto.Response;
import com.bixin.ddd.convertor.UserProfileConvertor;
import com.bixin.ddd.domain.gateway.UserProfileGateway;
import com.bixin.ddd.domain.user.UserProfile;
import com.bixin.ddd.dto.UserProfileUpdateCmd;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserProfileUpdateCmdExe {

    @Resource
    private UserProfileGateway userProfileGateway;

    public Response execute(UserProfileUpdateCmd cmd) {
        UserProfile userProfile = UserProfileConvertor.toEntity(cmd.getUserProfileCO());
        userProfileGateway.update(userProfile);
        return Response.buildSuccess();
    }
}