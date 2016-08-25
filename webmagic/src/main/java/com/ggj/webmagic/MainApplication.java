package com.ggj.webmagic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author:gaoguangjin
 * @date 2016/8/19 10:52
 */
// 发现注解@Scheduled的任务并后台执行
@EnableScheduling
//搜索servlert
@ServletComponentScan
@SpringBootApplication
//扫描mybatis接口
//@MapperScan("com.ggj")
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }
}
