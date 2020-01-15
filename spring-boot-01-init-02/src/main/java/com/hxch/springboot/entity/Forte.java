package com.hxch.springboot.entity;

/**
 * @ClassName:Forte
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2020/1/15 0015 14:26
 **/

public class Forte {

    private String name;
    private Integer time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Forte{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
