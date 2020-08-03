package com.xc.justforjoy.config;

import com.xc.justforjoy.controller.MyFirstInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author lxcecho
 * @since 2020/8/3
 * <p>
 * SpringMVC只扫描Controller；子容器
 * useDefaultFilters=false 禁用掉默认的过滤规则。
 */
@ComponentScan(value = "com.xc", includeFilters = {
        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
}, useDefaultFilters = false)
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter {
    //定制SpringMVC
    //配置视图解析器
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //默认所有的页面都是从 WEB-INF/XX.jsp
//		registry.jsp();
        registry.jsp("WEB-INF/views/", ".jsp");
    }

    //配置静态资源访问
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    //配置拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyFirstInterceptor()).addPathPatterns("/**");
    }
}
