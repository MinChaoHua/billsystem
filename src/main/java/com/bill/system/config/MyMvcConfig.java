package com.bill.system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

    /**
     * ctrl+o 出现可重写的方法
     * */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

        /* 视图跳转控制器 */
        @Override
        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/login").setViewName("index");
            registry.addViewController("/calendar.html").setViewName("calendar");
            registry.addViewController("/chart.html").setViewName("chart");
            registry.addViewController("/form.html").setViewName("form");
            registry.addViewController("/sign-up.html").setViewName("sign-up");
            registry.addViewController("/table-list.html").setViewName("table-list");
            registry.addViewController("/table-list-img.html").setViewName("table-list-img");



        }
        /* 拦截器配置 ,注册拦截器*/
//        @Override
//        public void addInterceptors(InterceptorRegistry registry) {
//            registry.addInterceptor(new MyHandlerInterceptor()).addPathPatterns("/**")
//                    .excludePathPatterns("/index","/index.html","/login","/tologin","/asserts/**");
//        }
//    /* 视图解析器 */
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//
//    }

    // 所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index");
                registry.addViewController("/index.html").setViewName("index");
                registry.addViewController("/success").setViewName("success");
                registry.addViewController("/dashboard").setViewName("dashboard");
                registry.addViewController("/tables.html").setViewName("tables");
            }
        };
        return webMvcConfigurer;
    }
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}

