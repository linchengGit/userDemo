package com.lc.user.service.impl;

import com.lc.user.dataobject.UserInfo;
import com.lc.user.repository.UserInfoRepository;
import com.lc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lc
 * @date 2019/3/22
 */
@Service
public class UserServiceImpl implements UserService {



    @Autowired
    private UserInfoRepository userInfoRepository;

    /**
     * 通过openId来查询用信息
     *
     * @param openid
     * @return
     */
    @Override
    public UserInfo findByOpenid(String openid) {
        return userInfoRepository.findByOpenid(openid);
    }
}
