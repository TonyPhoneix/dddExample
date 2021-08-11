package com.bixin.ddd.service;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.bixin.ddd.api.UserProfileServiceI;
import com.bixin.ddd.command.RefreshScoreCmdExe;
import com.bixin.ddd.command.UserProfileAddCmdExe;
import com.bixin.ddd.command.UserProfileUpdateCmdExe;
import com.bixin.ddd.command.query.UserProfileGetQryExe;
import com.bixin.ddd.command.query.UserProfileListQryExe;
import com.bixin.ddd.dto.*;
import com.bixin.ddd.dto.clientobject.UserProfileCO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * UserProfileServiceImpl
 *
 * @author Frank Zhang
 * @date 2019-02-28 6:22 PM
 */
@Service
public class UserProfileServiceImpl implements UserProfileServiceI {
    @Resource
    private UserProfileAddCmdExe userProfileAddCmdExe;
    @Resource
    private UserProfileUpdateCmdExe userProfileUpdateCmdExe;
    @Resource
    private RefreshScoreCmdExe refreshScoreCmdExe;
    @Resource
    private UserProfileGetQryExe userProfileGetQryExe;
    @Resource
    private UserProfileListQryExe userProfileListQryExe;


    @Override
    public Response addUserProfile(UserProfileAddCmd userProfileAddCmd) {
        return userProfileAddCmdExe.execute(userProfileAddCmd);
    }

    @Override
    public Response updateUserProfile(UserProfileUpdateCmd cmd) {
        return userProfileUpdateCmdExe.execute(cmd);
    }

    @Override
    public Response refreshScore(RefreshScoreCmd cmd) {
        return refreshScoreCmdExe.execute(cmd);
    }

    @Override
    public SingleResponse<UserProfileCO> getUserProfileBy(UserProfileGetQry qry) {
        return userProfileGetQryExe.execute(qry);
    }

    @Override
    public MultiResponse<UserProfileCO> listUserProfileBy(UserProfileListQry qry) {
        return userProfileListQryExe.execute(qry);
    }
}
