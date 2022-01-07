package com.yun.demo.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DruidConfig {

    @Value("${spring.datasource.druid.stat.exclusions:/static/*,*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*}")
    private String exclusions;
    @Value("${spring.datasource.druid.stat-view-servlet.login-username:admin}")
    private String loginUsername;
    @Value("${spring.datasource.druid.stat-view-servlet.login-password:admin}")
    private String loginPassword;
    @Value("${spring.datasource.druid.stat-view-servlet.allow:127.0.0.1}")
    private String druidWhitelist;
    @Value("${spring.datasource.druid.stat-view-servlet.deny:192.168.0.2}")
    private String druidBlacklist;

    /**
     * 配置Druid监控
     * 后台管理Servlet
     * @return ServletRegistrationBean<StatViewServlet>
     */
    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        Map<String,String> initParams = new HashMap<>();//这是配置的druid监控的登录密码
        initParams.put("loginUsername", loginUsername);
        initParams.put("loginPassword", loginPassword);
        //默认就是允许所有访问
        initParams.put("allow", druidWhitelist);
        //黑名单的IP
        initParams.put("deny", druidBlacklist);
        bean.setInitParameters(initParams);
        return bean;
    }

    /**
     * 配置web监控的filter
     * @return FilterRegistrationBean<WebStatFilter>
     */
    @Bean
    public FilterRegistrationBean<WebStatFilter> webStatFilter(){
        FilterRegistrationBean<WebStatFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new WebStatFilter());
        Map<String,String> initParams = new HashMap<>();
        initParams.put("exclusions", exclusions);
        bean.setInitParameters(initParams);
        bean.setUrlPatterns(Collections.singletonList("/*"));
        return bean;
    }
}
