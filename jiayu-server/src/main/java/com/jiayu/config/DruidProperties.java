package com.jiayu.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by ThinkPad on 2018/6/15.
 */
@ConfigurationProperties(prefix = "spring.datasource.druid")
public class DruidProperties {
    private int initalSize;
    private int minIdle;
    private int maxIdle;

    public int getInitalSize() {
        return initalSize;
    }

    public void setInitalSize(int initalSize) {
        this.initalSize = initalSize;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }
}
