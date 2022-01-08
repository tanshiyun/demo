package com.yun.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Setter
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceConfig {

    private String url;
    private String username;
    private String password;
    private String driverClassName;


    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DruidDataSource datasource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DruidDataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

}

