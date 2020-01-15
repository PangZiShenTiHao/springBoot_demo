package com.hxch.springboot.config;

import com.hxch.springboot.service.EmpService02;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName:EmpConfig
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2020/1/15 0015 15:33
 **/

@Configuration
public class EmpConfig {

    @Bean(value = "empService02")
    public EmpService02 empService02(){
        return new EmpService02();
    }
}
