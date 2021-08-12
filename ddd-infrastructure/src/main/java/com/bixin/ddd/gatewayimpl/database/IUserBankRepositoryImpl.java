package com.bixin.ddd.gatewayimpl.database;

import com.bixin.ddd.domain.userbank.aggregate.UserBank;
import com.bixin.ddd.domain.userbank.repo.IUserBankRepository;
import com.bixin.ddd.gatewayimpl.database.dataobject.UserBankDO;
import com.bixin.ddd.gatewayimpl.database.mapper.UserBankDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class IUserBankRepositoryImpl implements IUserBankRepository {

    @Autowired
    private UserBankDOMapper mapper;

    @Override
    public Optional<UserBank> findById(Long id) {
        UserBankDO userBankDO = mapper.selectByPrimaryKey(id);
        return Optional.ofNullable(userBankDO).map(ub ->
                UserBank.builder()
                        .id(ub.getId())
                        .uid(ub.getUid())
                        .bankName(ub.getBankName())
                        .bankCardNo(ub.getBankCardNo())
                        .bankCity(ub.getBankCity())
                        .branchBank(ub.getBranchBank())
                        .bankHolder(ub.getBankHolder())
                        .state(ub.getState())
                        .flag(ub.getFlag())
                        .build());
    }

    @Override
    public UserBank save(UserBank userBank) {
        UserBankDO userBankDO = UserBankDO.builder()
                .id(userBank.getId())
                .uid(userBank.getUid())
                .bankName(userBank.getBankName())
                .bankCardNo(userBank.getBankCardNo())
                .bankCity(userBank.getBankCity())
                .branchBank(userBank.getBranchBank())
                .bankHolder(userBank.getBankHolder())
                .state(userBank.getState())
                .flag(userBank.getFlag())
                .build();
        mapper.insertOrUpdate(userBankDO);
        return findById(userBankDO.getId()).get();
    }
}
