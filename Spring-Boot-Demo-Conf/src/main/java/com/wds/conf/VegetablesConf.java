package com.wds.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:application.properties")
public class VegetablesConf {

    private String mushroom;
    private String chick;

    public String getMushroom() {
        return mushroom;
    }

    public void setMushroom(String mushroom) {
        this.mushroom = mushroom;
    }

    public String getChick() {
        return chick;
    }

    public void setChick(String chick) {
        this.chick = chick;
    }
}
