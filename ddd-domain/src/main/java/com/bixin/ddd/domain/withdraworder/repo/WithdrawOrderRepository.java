package com.bixin.ddd.domain.withdraworder.repo;

import com.bixin.ddd.domain.withdraworder.aggregate.WithdrawOrder;

public interface WithdrawOrderRepository {

    /**
     * 查找提现单
     *
     * @param id
     * @return
     */
    WithdrawOrder findById(Integer id);

    /**
     * 保存提现单
     *
     * @param withdrawOrder
     * @return
     */
    Integer save(WithdrawOrder withdrawOrder);
}
