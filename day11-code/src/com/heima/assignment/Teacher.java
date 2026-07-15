package com.heima.assignment;

public class Teacher {
    private String name;
    private String major;


    public Teacher() {
    }

    public Teacher(String name, String major) {
        this.name = name;
        this.major = major;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置
     * @param major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return "Teacher{name = " + name + ", major = " + major + "}";
    }
}
