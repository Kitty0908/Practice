package com.wds.template.bean;

import com.wds.template.util.YamlPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "restaurant")
@PropertySource(value = "classpath:restaurant.yml",encoding = "UTF-8",factory = YamlPropertySourceFactory.class)
@Data
public class Restaurant {

    private String boss;
    private String chief;

}
