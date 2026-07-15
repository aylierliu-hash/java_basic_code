package com.heima.assignment;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        String choice = "0";

        while (!choice.equals("6")) {
            System.out.println("-----请选择要进行的操作：-----");
            System.out.println("1. 添加图书");
            System.out.println("2. 打印所有图书");
            System.out.println("3. 根据名称查询图书");
            System.out.println("4. 删除图书");
            System.out.println("5. 更新图书");
            System.out.println("6. 退出");

            choice = sc.nextLine();

            switch (choice) {
                case "1" -> addBook(list);
                case "2" -> printAllBooks(list);
                case "3" -> getBook(list);
                case "4" -> deleteBook(list);
                case "5" -> updateBook(list);
                case "6" -> System.out.println("谢谢使用，再见！");
                default -> System.out.println("输入错误，请重新输入");
            }
        }

    }

    public static void addBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入图书信息：");

        System.out.println("请输入新图书的id");
        String id = sc.nextLine();
        while (!isIdUnique(list, id)) {
            System.out.println("请输入新图书的id");
            id = sc.nextLine();
        }
        System.out.println("请输入新图书的名称");
        String name = sc.nextLine();
        System.out.println("请输入新图书的作者");
        String author = sc.nextLine();
        System.out.println("请输入新图书的价格");
        String price = sc.nextLine();

        Book book = new Book(id, name, author, price);
        list.add(book);
        System.out.println("添加成功");
        System.out.println(book);
    }
    public static void printAllBooks(ArrayList<Book> list){
        if(list == null || list.isEmpty()){
            System.out.println("当前图书列表为空");
            return;
        }
        for (Book book : list) {
            System.out.println(book);
        }
    }
    public static void getBook(ArrayList<Book> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的图书名称");
        String name = sc.nextLine();
        int index = getIndexByName(list, name);
        if (index == -1) {
            System.out.println("未找到该图书");
            return;
        }
        System.out.println(list.get(index));
    }

    public static void deleteBook(ArrayList<Book> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的图书的id");
        String id = sc.nextLine();
        int index = getIndexById(list, id);
        if (index == -1) {
            System.out.println("未找到该图书");
            return;
        }
        list.remove(index);
        System.out.println("删除成功");
//        printAllBooks(list);

    }

    public static void updateBook(ArrayList<Book> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要更新的图书的id");
        String id = sc.nextLine();
        int index = getIndexById(list, id);
        if (index == -1) {
            System.out.println("未找到该图书");
            return;
        }
        System.out.println("当前图书信息为：" + list.get(index));
        System.out.println("请输入新图书的名称");
        String name = sc.nextLine();
        System.out.println("请输入新图书的作者");
        String author = sc.nextLine();
        System.out.println("请输入新图书的价格");
        String price = sc.nextLine();

        list.set(index, new Book(id, name, author, price));
        System.out.println("更新成功");
        System.out.println(list.get(index));
    }

    //获取索引
    public static int getIndexByName(ArrayList<Book> list, String name){

        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            if (book.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static int getIndexById(ArrayList<Book> list, String id){

        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            if (book.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    //判断id唯一
    public static boolean isIdUnique(ArrayList<Book> list, String id){
         if (list.isEmpty()) {
             return true;
         }
        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            if (book.getId().equals(id)) {
                System.out.println("id已存在");
                return false;
            }
        }
        return true;
    }
}
