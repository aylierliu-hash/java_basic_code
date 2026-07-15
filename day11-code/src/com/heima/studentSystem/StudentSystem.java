package com.heima.studentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // 选择这里建议使用String类型接收用户输入，因为用户输入的可能是数字也可能是字母，甚至其他符号空格
        //使用int的话直接报错
        String choice = "";
        loop:
        while (!choice.equals("5")) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择:");
            choice = sc.next();

            switch (choice) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> setStudent(list);
                case "4" -> getStudent(list);
                case "5" ->{
                    System.out.println("退出系统");
                    break loop;
//                    System.exit(0);//停止虚拟机
                }
                default ->System.out.println("输入有误，请重新输入");
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("添加学生");
        System.out.println("请输入学生信息:");

        String id;
        while (true) {
            System.out.println("请输入学生ID:");
            id = sc.next();
            if(!checkIdValid(list,id)){
                System.out.println("id已存在，请重新输入");
                continue;
            }
            break;
        }
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        String age = sc.next();
        System.out.println("请输入学生地址:");
        String address = sc.next();
        Student student = new Student(id, name, age, address);
        list.add(student);
        System.out.println("添加学生成功");
        System.out.println(student);
    }

    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("删除学生");
        System.out.println("请输入要删除的学生ID:");
        String deleteId = sc.next();
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId().equals(deleteId)) {
//                list.remove(i);
//                System.out.println("删除成功");
//                return;
//            }
//        }
        int index = getIndex(list,deleteId);
        if(index != -1){
            list.remove(index);
            System.out.println("id为："+deleteId+"的学生删除成功");
            return;
        }
        System.out.println("未找到id为："+deleteId+"的学生");
        System.out.println("删除失败");
    }

    public static  void setStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("修改学生");
        System.out.println("请输入要修改的学生id：");
        String id = sc.next();
//        for (int i = 0; i < list.size(); i++) {
//            Student modifyStudent = list.get(i);
//            if (modifyStudent.getId().equals(modifyId)) {
//                System.out.println("请输入修改后的学生信息：");
//                String modifyId2;
//                while (true) {
//                    System.out.println("请输入学生id：");
//                    modifyId2 = sc.next();
//                    if(!checkIdValid(list,modifyId2)){
//                        System.out.println("id已存在，请重新输入");
//                        continue;
//                    }
//                    break;
//                }
//                System.out.println("请输入学生姓名：");
//                String modifyName = sc.next();
//                System.out.println("请输入学生年龄：");
//                String modifyAge = sc.next();
//                System.out.println("请输入学生地址：");
//                String modifyAddress = sc.next();
//
//                Student modifyStudent2 = new Student(modifyId2, modifyName, modifyAge, modifyAddress);
//                int index = getIndex(list,modifyId2);
//                list.set(index, modifyStudent2);
//                System.out.println("修改成功");
//                System.out.println(modifyStudent2);
//                return;
//            }
//        }
        int index = getIndex(list, id);
        if(index == -1){
            System.out.println("未找到id为："+id+"的学生");
            System.out.println("修改失败");
            return;
        }
        System.out.println("请输入修改后的学生信息：");
        String modifyId;
        while (true) {
            System.out.println("请输入修改后的学生id：");
            modifyId = sc.next();
            if(!checkIdValid(list,modifyId)){
                System.out.println("id已存在，请重新输入");
                continue;
            }
            break;
        }

        System.out.println("请输入修改后的学生姓名：");
        String modifyName = sc.next();
        System.out.println("请输入修改后的学生年龄：");
        String modifyAge = sc.next();
        System.out.println("请输入修改后的学生地址：");
        String modifyAddress = sc.next();

        Student modifyStudent = new Student(modifyId, modifyName, modifyAge, modifyAddress);

        list.set(index, modifyStudent);
        System.out.println("修改成功");
        System.out.println(modifyStudent);

    }

    public static void getStudent(ArrayList<Student> list) {
        if(list.isEmpty()) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("查询学生");
        System.out.println("id--------姓名-------年龄--------家庭地址");
        for (int i = 0; i < list.size(); i++) {
            Student studentShow = list.get(i);
            if(studentShow == null){
                continue;
            }
            System.out.println(studentShow.getId()+"\t"+studentShow.getName()+"\t"+studentShow.getAge()+"\t"+studentShow.getAddress());
        }
    }

    //id唯一判断
    public static boolean checkIdValid(ArrayList<Student> list,String id) {
        //提高代码复用性
//        if(list.isEmpty()) {
//            return true;
//        }
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId().equals(id)) {
//                return false;
//            }
//        }
//        return true;
        int result = getIndex(list,id);
        return result == -1;
    }

    //通过id获取index
    public static int getIndex(ArrayList<Student> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
