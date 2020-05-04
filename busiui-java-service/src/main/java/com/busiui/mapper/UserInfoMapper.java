package com.busiui.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.busiui.domain.UserInfoDo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author sunbaojin
 * @date 2020/5/4 22:30
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfoDo> {

    @Insert(value = "INSERT INTO user_info (user_name, user_email) VALUES ('${userName}', '${userEmail}' ) ")
    public int insertUserInfo(UserInfoDo userInfoDo);
//    public int updateUserInfo(UserInfoDo userInfoDo);
//    public int deleteUserInfoById(Long id);
}
