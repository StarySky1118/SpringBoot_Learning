package com.zzy.config;

import com.zzy.web.LoginInterceptor;
import com.zzy.web.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // SpringMVC配置类
public class SpringMVCConfig implements WebMvcConfigurer {
    /**
     * 注册拦截器对象
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String path[] = {"/user/**"}; // 拦截路径
        String excludedPath[] = {"/user/login"}; // 不拦截的路径

        registry.addInterceptor(new LoginInterceptor()) // 注册拦截器
                .addPathPatterns(path) // 拦截路径
                .excludePathPatterns(excludedPath); // 不拦截的路径

    }

    /**
     * 注册过滤器
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        // 使用那个过滤器
        filterRegistrationBean.setFilter(new MyFilter());
        // 过滤的地址
        filterRegistrationBean.addUrlPatterns("/user/*");
        return filterRegistrationBean;
    }
}
