package cn.itcast.sprintboot.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shenmin on 2018/1/31.
 */
@Configuration
@ComponentScan(basePackages = "cn.itcast.sprintboot.javaconfig")
public class SpringConfig {
    @Bean
    public UserDAO getUserDAO(){
        return new UserDAO();
    }
}
