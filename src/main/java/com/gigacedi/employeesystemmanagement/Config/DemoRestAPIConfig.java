package com.gigacedi.employeesystemmanagement.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.gigacedi.employeesystemmanagement.")
public class DemoRestAPIConfig {
}
