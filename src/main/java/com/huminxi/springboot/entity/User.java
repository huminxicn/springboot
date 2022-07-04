package com.huminxi.springboot.entity;

/**
 * 一句话概括功能。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/04/07 19:45
 */
public class User {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
