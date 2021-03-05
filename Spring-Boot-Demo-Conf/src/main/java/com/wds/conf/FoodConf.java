package com.wds.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "food")
public class FoodConf {

    private String rice;
    private String meat;

    public FoodConf() {
    }

    public FoodConf(String rice, String meat) {
        this.rice = rice;
        this.meat = meat;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
