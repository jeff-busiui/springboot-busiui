package com.busiui;

import com.busiui.domain.UserInfoDo;
import com.busiui.mapper.UserInfoMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author sunbaojin
 * @date 2020/5/4 22:31
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMybatis {

    @Autowired
    private UserInfoMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<UserInfoDo> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
}
