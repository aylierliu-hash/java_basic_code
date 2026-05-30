package com.itheima.test2_4;

public class PersonTest {
    static void main(String[] args) {
        Person[] persons = new Person[4];

        persons[0] = new Person("张三", 18, '男', new String[]{"看电影", "听歌"});
        persons[1] = new Person("李四", 19, '女', new String[]{"看电影", "听歌", "打篮球"});
        persons[2] = new Person("王五", 20, '男', new String[]{"看电影", "听歌", "看电影", "看电影"});
        persons[3] = new Person("赵六", 21, '女', new String[]{"看电影", "听歌", "编织"});

        int sumAge = 0;
        for (int i = 0; i < persons.length; i++) {
            sumAge += persons[i].getAge();
        }

        double avgAge = sumAge / persons.length;
        System.out.println("平均年龄：" + avgAge);

        for (int i = 0; i < persons.length; i++){
            if(persons[i].getAge() < avgAge){
                persons[i].showInfo();
            }
        }
    }
}
