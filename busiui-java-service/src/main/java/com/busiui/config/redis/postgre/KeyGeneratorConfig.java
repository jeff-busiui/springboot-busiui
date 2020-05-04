package com.busiui.config.redis.postgre;

import com.baomidou.mybatisplus.core.incrementer.IKeyGenerator;
import com.baomidou.mybatisplus.extension.incrementer.H2KeyGenerator;
import com.baomidou.mybatisplus.extension.incrementer.PostgreKeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunbaojin
 * @date 2020/5/4 23:08
 */
@Configuration
public class KeyGeneratorConfig {

    @Bean
    public IKeyGenerator keyGenerator() {
        return new PostgreKeyGenerator();
    }
}
