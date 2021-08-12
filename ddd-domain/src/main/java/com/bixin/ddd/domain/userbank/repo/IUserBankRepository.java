package com.bixin.ddd.domain.userbank.repo;

import com.bixin.ddd.domain.userbank.aggregate.UserBank;

import java.util.Optional;

public interface IUserBankRepository {

    /**
     * 查找提现单
     *
     * @param id
     * @return
     */
    Optional<UserBank> findById(Long id);

    /**
     * 保存提现单
     *
     * @param userBank
     * @return
     */
    UserBank save(UserBank userBank);
}
