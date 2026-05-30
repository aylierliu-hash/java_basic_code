package com.itheima.test3;

public class Person {
    //属性
    private String name;
    private int age;
    private String gender;

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
        if(age > 0 && age < 120){
            this.age = age;
        }else {
            System.out.println("年龄输入错误");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void sleep(){
        System.out.println("sleep");
    }
    public void eat(){
        System.out.println("eat");
    }
}
