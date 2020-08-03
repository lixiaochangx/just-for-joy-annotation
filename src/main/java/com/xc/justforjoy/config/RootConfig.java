package com.xc.justforjoy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.FilterType;

/**
 * @author lxcecho
 * @since 2020/8/3
 * <p>
 * Spring的容器不扫描controller；父容器
 */
@ComponentScan(value = "com.xc", excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
})
public class RootConfig {

}
