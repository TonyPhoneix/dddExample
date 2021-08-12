package com.bixin.ddd.service;

import com.alibaba.cola.exception.BizException;
import com.bixin.ddd.common.event.DomainEventPublisher;
import com.bixin.ddd.converter.Converter;
import com.bixin.ddd.domain.userbank.aggregate.UserBank;
import com.bixin.ddd.domain.userbank.event.UserBankBindEvent;
import com.bixin.ddd.domain.userbank.repo.IUserBankRepository;
import com.bixin.ddd.domain.userbank.service.BindService;
import com.bixin.ddd.domain.userbank.service.ModifyService;
import com.bixin.ddd.gatewayimpl.database.mapper.UserBankDOMapper;
import com.bixin.ddd.request.UserBankBindRequest;
import com.bixin.ddd.request.UserBankModifyRequest;
import com.bixin.ddd.response.UserBankInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 绑卡 应用服务 中介层
 */
@Service
public class UserBankAppService {

    @Autowired
    private BindService bindService;

    @Autowired
    private ModifyService modifyService;

    @Autowired
    private IUserBankRepository userBankRepository;

    @Autowired
    private UserBankDOMapper userBankDOMapper;

    @Autowired
    private DomainEventPublisher domainEventPublisher;

    /**
     * 绑定
     */
    public void bind(UserBankBindRequest req) {
        UserBank userBank = bindService.bind(Converter.of(req));
        //发布领域事件
        domainEventPublisher.publish(UserBankBindEvent.of(userBank.getUid(), userBank.getId()));
    }

    /**
     * 解绑
     */
    public void unBind(Long id) {
        UserBank userBank = userBankRepository.findById(id)
                .orElseThrow(() -> new BizException("银行卡不存在"));
        userBank.unbind();
        userBankRepository.save(userBank);
    }

    /**
     * 修改
     */
    public void modify(UserBankModifyRequest req) {
        modifyService.modify(Converter.of(req));
    }

    /**
     * 查询该用户绑定的所有卡
     *
     * @param uid
     * @return
     */
    public List<UserBankInfo> selectAllByUid(Long uid) {
        return userBankDOMapper.selectAllByUid(uid)
                .stream().map(Converter::of).collect(Collectors.toList());
    }
}
