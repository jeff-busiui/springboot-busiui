package com.busiui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author sunbaojin
 * @date 2020/5/4 22:18
 */
@SpringBootApplication
@MapperScan("com.busiui.mapper")
@EnableSwagger2
public class BusiuiJavaMain {
    public static void main(String[] args) {
            SpringApplication.run(BusiuiJavaMain.class,args);
    }
}
