package com.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Properties;
import java.util.Random;

@Configuration // Indicates that this class is a configuration class.
@ComponentScan("com.spring") // Scan all components in this path
@PropertySource("classpath:application.properties")
public class AppConfiguration {

    @Autowired
    private Environment environment;

    @Bean
    public Random random() {
        return new Random();
    }

    @Bean
    public Properties properties() {
        Properties properties = new Properties();
        properties.put("mymail", environment.getProperty("email"));
        properties.put("myphone", environment.getProperty("phone"));

        return properties;
    }
}
