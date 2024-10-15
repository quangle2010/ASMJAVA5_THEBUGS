package com.fpoly.java5.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**")
                .addResourceLocations("file:///D:/Study/Learning/Srpingboot/wsJava5/ASMTheBugs/ASMJAVA5_THEBUGS/images/");

        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
        
        registry.addResourceHandler("/img/**")
        .addResourceLocations("classpath:/static/img/");
    }
}
