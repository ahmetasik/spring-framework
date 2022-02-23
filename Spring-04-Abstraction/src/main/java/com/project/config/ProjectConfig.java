package com.project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.project.proxy","com.project.repository","com.project.service"})
public class ProjectConfig {

}
