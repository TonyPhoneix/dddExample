package com.bixin.ddd.api;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.bixin.ddd.request.UserBankBindRequest;
import com.bixin.ddd.request.UserBankModifyRequest;
import com.bixin.ddd.response.UserBankInfo;

import java.util.List;

/**
 * 假设是dubbo接口
 * <p>
 * 提现绑卡接口
 */
public interface IUserBankService {

    /**
     * 绑定卡
     *
     * @param req
     * @return
     */
    Response bind(UserBankBindRequest req);

    /**
     * 解绑
     *
     * @param id
     * @return
     */
    Response unBind(Long id);

    /**
     * 修改卡
     *
     * @param req
     * @return
     */
    Response modify(UserBankModifyRequest req);

    /**
     * 查询用户持有的所有卡
     *
     * @param uid
     * @return
     */
    SingleResponse<List<UserBankInfo>> selectAllByUid(Long uid);
}
