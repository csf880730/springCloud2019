package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author caosufeng
 * @date 2019/10/21  - 20:43
 */
@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7003_App {
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaServer7003_App.class, args);
    }
}
