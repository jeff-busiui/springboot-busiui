package com.busiui.service.impl;

import com.busiui.domain.UserInfoDo;
import com.busiui.mapper.UserInfoMapper;
import com.busiui.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sunbaojin
 * @date 2020/5/4 22:57
 */
@Service
public class UserTestServiceImpl implements UserTestService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfoDo findUserInfoById(Long id) {
        return userInfoMapper.selectById(id);
    }

    @Override
    public int insertUserInfo(UserInfoDo userInfoDo) {
        return userInfoMapper.insertUserInfo(userInfoDo);
    }

    @Override
    public int updateUserInfo(UserInfoDo userInfoDo) {
        return 0;
    }

    @Override
    public int deleteUserInfoById(Long id) {
        return 0;
    }
}
