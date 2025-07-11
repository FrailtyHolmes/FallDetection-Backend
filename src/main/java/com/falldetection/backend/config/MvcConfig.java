package com.falldetection.backend.config;

import com.falldetection.backend.interceptor.LoginInterceptor;
import com.falldetection.backend.interceptor.RefreshTokenInterceptor;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 登录拦截器
//        registry.addInterceptor(new LoginInterceptor())
//                .addPathPatterns("/api/**")
//                .excludePathPatterns(
//                        "/api/user/login", "/api/user/register"
//                ).order(1);
//        // token刷新的拦截器
//        registry.addInterceptor(new RefreshTokenInterceptor(stringRedisTemplate)).addPathPatterns("/**").order(0);
    }

}
