package com.busiui.service;

import com.busiui.domain.UserInfoDo;

/**
 * @author sunbaojin
 * @date 2020/5/4 22:28
 */
public interface UserTestService {

    public UserInfoDo findUserInfoById(Long id);
    public int insertUserInfo(UserInfoDo userInfoDo);
    public int updateUserInfo(UserInfoDo userInfoDo);
    public int deleteUserInfoById(Long id);
}
