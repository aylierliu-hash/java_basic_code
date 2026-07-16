package com.heima.studentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("user1", "123456", "123456200101011111", "13800000001"));
        list.add(new User("user2", "123456", "123456200202022222", "13800000002"));
        list.add(new User("user3", "123456", "123456200303033333", "13800000003"));

        String choice = "";
        while (!choice.equals("exit")) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码");
            choice = sc.nextLine();
            switch (choice) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "exit" -> System.out.println("谢谢使用，再见！");
                default -> System.out.println("输入错误，请重新输入！");
            }
        }
    }

    // 登录
    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            // 1. 输入用户名
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            int index = findUser(list, name);
            if (index == -1) {
                System.out.println("用户名不存在，请先注册！");
                return;
            }
            // 2. 输入密码
            System.out.println("请输入密码");
            String password = sc.nextLine();
            // 3. 输入验证码
            String code = generateCode();
            while (true) {
                System.out.println("验证码为：" + code);
                System.out.println("请输入验证码");
                String inputCode = sc.nextLine();
                if (!inputCode.equals(code)) {
                    System.out.println("验证码错误");
                    continue;
                }
                System.out.println("验证码正确");
                break;
            }

            if (!list.get(index).getPassword().equals(password)) {

                System.out.println("密码错误");
                System.out.println("还有" + (2 - i) + "次机会");
                continue;
            }
            System.out.println("登录成功");
            System.out.println("欢迎用户：" + list.get(index).getName());
            // 4. 启动学生管理系统
            StudentSystem ss = new StudentSystem();
            ss.startStudentSystem();
            return;
        }
        System.out.println("3次密码均错误，登录失败");
    }

    // 注册
    private static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String password = "";
        String id = "";
        String phone = "";
        int index;
        while (true) {
            System.out.println("请输入用户名");
            name = sc.nextLine();
            index = findUser(list, name);
            if (index != -1) {
                System.out.println("用户名已存在，请重新输入！");
                continue;
            }

            if (!validateName(name)) {
                System.out.println("用户名格式错误，请重新输入！");
                continue;
            }
            break;
        }
        System.out.println("用户名：" + name+"可用");
        while (true) {
            System.out.println("请输入密码");
            String password1 = sc.nextLine();
            System.out.println("请确认密码");
            String password2 = sc.nextLine();
            if (!password1.equals(password2)) {
                System.out.println("两次密码不一致，请重新输入！");
                continue;
            }
            password = password1;
            break;
        }


        while (true) {
            System.out.println("请输入身份证号");
            id = sc.nextLine();
            if (!validateIdCard(id)) {
                System.out.println("身份证号格式错误，请重新输入！");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println("请输入手机号");
            phone = sc.nextLine();
            if (!validatePhone(phone)) {
                System.out.println("手机号格式错误，请重新输入！");
                continue;
            }
            break;
        }
        User user = new User(name, password, id, phone);
        list.add(user);
        System.out.println("注册成功");
        System.out.println(user);


    }

    // 忘记密码
    private static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String name;
        String id;
        String phone;
        int index;
        while (true) {
            System.out.println("请输入用户名");
            name = sc.nextLine();
            index = findUser(list, name);
            if (index == -1) {
                System.out.println("用户名不存在，请先注册！");
                continue;
            }
            break;
        }
        User user = list.get(index);
        while (true) {
            System.out.println("请输入身份证号");
            id = sc.nextLine();
            System.out.println("请输入手机号");
            phone = sc.nextLine();
            if (!validateIdCard(id) || !validatePhone(phone)) {
                System.out.println("身份证号或手机号格式错误，请重新输入！");
                continue;
            }

            //注意身份证最后一位不区分大小写
            if (!user.getId().equalsIgnoreCase(id) || !user.getPhone().equals(phone)) {
                System.out.println("身份证号或手机号错误，账号信息不匹配，请重新输入！");
                continue;
            }
            break;
        }

        //新密码也要两次确认一致才能重置
        String password;
        while (true) {
            System.out.println("请输入新密码");
            password = sc.nextLine();
            System.out.println("请确认新密码");
            String password2 = sc.nextLine();
            if (!password.equals(password2)) {
                System.out.println("两次密码不一致，请重新输入！");
                continue;
            }
            break;
        }
        user.setPassword(password);
        System.out.println("用户" + user.getName() + "密码重置成功");

    }


    //打印集合
//    private static void printList(ArrayList<User> list) {
//        for (User user : list) {
//            System.out.println(user);
//        }
//    }

    //查找用户
    private static int findUser(ArrayList<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    //生成验证码
    private static String generateCode() {
        Random random = new Random();
        char[] code = new char[5];
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        code[0] = (char) (random.nextInt(10) + '0');
        for (int i = 1; i < 5; i++) {
            code[i] = alphabet[random.nextInt(alphabet.length)];
        }

        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(5);
            char temp = code[i];
            code[i] = code[index];
            code[index] = temp;
        }
        return new String(code);

    }

    //生成验证码的另一种方法
    private static String generateCode1() {
        //创建字母表集合
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) (i + 'a'));
            list.add((char) (i + 'A'));
        }
        Random random = new Random();
        char[] code = new char[5];
        code[0] = (char) (random.nextInt(10) + '0');
        for (int i = 1; i < 5; i++) {
            code[i] = list.get(random.nextInt(list.size()));
        }

        //由于字母也是随机的，所以要打乱验证码，只需要打乱数字的位置就可以了
        char temp = code[0];
        int index = random.nextInt(5);
        code[0] = code[index];
        code[index] = temp;


        return new String(code);
    }

    //验证手机号
    private static boolean validatePhone(String phone) {
        return phone.matches("[1-9]+[0-9]{10}");
    }
    private static boolean validateIdCard(String id) {
        return id.matches("[1-9]+[0-9]{16}[0-9Xx]");
    }
    public static boolean validateName(String name) {
        return name.matches("(?=.*[a-zA-Z])[a-zA-Z0-9]{3,15}");
    }

}
