package com.alibaba;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;

import java.util.Date;

public class excelZhu {
    @ExcelProperty(value = "姓名")
    private String name;

    @ExcelProperty(value = "年龄")
    private  int age;

    @DateTimeFormat("yyyy-MM-dd")
    @ExcelProperty(value = "操作时间")
    private Date time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
