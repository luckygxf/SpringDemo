package com.gxf.entity;

/**
 * Created by GuanXF on 2017/12/14.
 */
public class Student {
    private String no;
    private String name;

    public Student() {
    }

    public Student(String no, String name) {
        this.no = no;
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
