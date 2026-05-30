package com.itheima.assignment.homework3;

public class Coder {
    private String name;
    private int id;
    private double salary;

    public void work(){
        System.out.println("工号为"+getId()+"工资为"+getSalary()+"的程序员" + name + "正在工作。。。");
    }

    public Coder() {
    }

    public Coder(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
