package com.busiui;

import com.busiui.config.redis.util.RedisBootUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @author sunbaojin
 * @date 2020/5/4 23:43
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class TestRedis {

    @Autowired
    RedisBootUtils redisBootUtils;
    @Test
    public void testRedis(){
        redisBootUtils.set("s1","s1_val");
        log.info("=========s1:"+redisBootUtils.get("s1"));
    }
}
