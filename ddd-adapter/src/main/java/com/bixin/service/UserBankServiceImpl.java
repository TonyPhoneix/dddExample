package com.bixin.service;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.bixin.ddd.api.IUserBankService;
import com.bixin.ddd.request.UserBankBindRequest;
import com.bixin.ddd.request.UserBankModifyRequest;
import com.bixin.ddd.response.UserBankInfo;
import com.bixin.ddd.service.UserBankAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBankServiceImpl implements IUserBankService {

    @Autowired
    private UserBankAppService userBankAppService;

    @Override
    public Response bind(UserBankBindRequest req) {
        userBankAppService.bind(req);
        return Response.buildSuccess();
    }

    @Override
    public Response unBind(Long id) {
        userBankAppService.unBind(id);
        return Response.buildSuccess();
    }

    @Override
    public Response modify(UserBankModifyRequest req) {
        userBankAppService.modify(req);
        return Response.buildSuccess();
    }

    @Override
    public SingleResponse<List<UserBankInfo>> selectAllByUid(Long uid) {
        List<UserBankInfo> userBankInfos = userBankAppService.selectAllByUid(uid);
        return SingleResponse.of(userBankInfos);
    }
}
