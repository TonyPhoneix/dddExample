package com.bixin.ddd.command;

import com.alibaba.cola.dto.Response;
import com.bixin.ddd.convertor.UserProfileConvertor;
import com.bixin.ddd.domain.gateway.UserProfileGateway;
import com.bixin.ddd.domain.user.UserProfile;
import com.bixin.ddd.dto.UserProfileAddCmd;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * UserProfileAddCmdExe
 *
 * @author Frank Zhang
 * @date 2019-02-28 6:25 PM
 */
@Component
public class UserProfileAddCmdExe {

    @Resource
    private UserProfileGateway userProfileGateway;

    public Response execute(UserProfileAddCmd cmd) {
        UserProfile userProfile = UserProfileConvertor.toEntity(cmd.getUserProfileCO());
        userProfileGateway.create(userProfile);
        return Response.buildSuccess();
    }
}
