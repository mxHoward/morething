package com.morething.demo.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author Howard
 * @Date 2017-11-1
 */
@Configuration
@ComponentScan("com.morething.demo")
@PropertySource("application.properties")
@EnableAsync
@EnableScheduling
@Import(
		MybatisConfiguration.class
)
public class SpringConfiguration {

}
