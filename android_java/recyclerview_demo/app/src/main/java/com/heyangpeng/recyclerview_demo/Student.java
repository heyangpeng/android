package com.heyangpeng.recyclerview_demo;

import java.util.Objects;

public class Student {
    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) &&
                Objects.equals(getDesc(), student.getDesc());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDesc());
    }
}
