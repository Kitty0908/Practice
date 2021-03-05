package com.wds;

import com.wds.conf.FoodConf;
import com.wds.conf.VegetablesConf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FoodConf.class, VegetablesConf.class})
public class DemoApplication {

    public static void main(String[] args){

        SpringApplication.run(DemoApplication.class, args);
    }
}
