package com.lc.user.service;

import com.lc.user.dataobject.UserInfo;

/**
 * @author lc
 * @date 2019/3/22
 */
public interface UserService {

    /**
     * 通过openId来查询用信息
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
