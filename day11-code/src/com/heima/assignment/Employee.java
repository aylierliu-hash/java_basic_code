package com.heima.assignment;

public class Employee {
    private String name;
    private String salary;


    public Employee() {
    }

    public Employee(String name, String salary) {
        this.name = name;
        this.salary = salary;
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
     * @return salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee{name = " + name + ", salary = " + salary + "}";
    }
}
