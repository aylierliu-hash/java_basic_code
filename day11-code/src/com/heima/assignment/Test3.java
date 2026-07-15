package com.heima.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("张三", "3000"));
        list.add(new Employee("李四", "3500"));
        list.add(new Employee("王五", "4000"));
        list.add(new Employee("赵六", "4500"));
        list.add(new Employee("田七", "5000"));

        int index = findEmployee(list, "王五");
        list.get(index).setName("王小五");
        printList(list);

        deleteEmployee(list, "赵六");
        printList(list);

        updateSalary(list, "田七");
        printList(list);


    }

    public static void printList(ArrayList<Employee> list) {
        for (Employee e : list) {
            System.out.println("姓名：" + e.getName() + "，工资：" + e.getSalary());
        }
    }

    public static int findEmployee(ArrayList<Employee> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);
            if (e.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void deleteEmployee(ArrayList<Employee> list, String name) {
        int index = findEmployee(list, name);
        if (index != -1) {
            list.remove(index);
            System.out.println("删除成功");
            return;
        }
        System.out.println("未找到员工：" + name);
        System.out.println("删除失败");
    }

    public static void updateSalary(ArrayList<Employee> list, String name) {
        int index = findEmployee(list, name);
        Scanner sc = new Scanner(System.in);
        if (index != -1) {
            System.out.println("请输入新的工资：");
            String newSalary = sc.nextLine();
            list.get(index).setSalary(newSalary);
            System.out.println("工资修改成功");
            System.out.println(list.get(index));
            return;
        }
        System.out.println("未找到员工：" + name);
        System.out.println("工资修改失败");
    }
}
