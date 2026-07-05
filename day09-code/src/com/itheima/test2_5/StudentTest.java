package com.itheima.test2_5;

/**
 * 定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
 *
 * 学生的属性：学号、姓名、年龄。
 *
 * 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
 * 注意若数组大小不够，创建新的数组载入新的数据
 *
 * 要求2：添加完毕之后，遍历所有学生信息。
 *
 * 要求3：通过id删除学生信息
 *
 * 如果存在，则删除，如果不存在，则提示删除失败。
 *
 * 要求4：删除完毕之后，遍历所有学生信息。
 *
 * 要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
 * 这个id目前做不了，胡换成别的随便什么id
 */

public class StudentTest {
    static void main(String[] args) {
        Student[] students = new Student[3];


        Student s1 = new Student(1001, "张三", 18);
        Student s2 = new Student(1002, "李四", 19);
        Student s3 = new Student(1003, "王五",19);
        Student s4 = new Student(1004, "赵六",20);

        students[0] = s1;
        students[1] = s2;

        System.out.println("----------------添加学生3----------------");
        students = insertStudent(students, s3);
        printArr(students);

        System.out.println("----------------添加学生4----------------");
        students = insertStudent(students, s4);
        printArr(students);

        System.out.println("----------------删除学生3----------------");
        students = deleteStudent(students, 1003);
        printArr(students);
        System.out.println("----------------删除不存在的学生----------------");
        students = deleteStudent(students, 1003);
        printArr(students);

        System.out.println("----------------查询学生----------------");
        students = queryStudentAndUpdateAgeBy1(students, 1004);
        printArr(students);

    }
    public static void printArr(Student[] students){
        for (Student s: students){
            if(s!=null){
                s.show();
            }
        }
    }

    public static Student[] insertStudent(Student[] students, Student s){
        //判断数组是否已满
        for (int i = 0; i < students.length; i++) {
            if(students[i]==null){
                //数组未满，直接添加
                students[i]=s;
                return students;
            }
        }
        //数组已满，创建新的数组载入新的数据
        Student[] newStudents = new Student[students.length+1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i]=students[i];
        }
        newStudents[students.length]=s;
        return newStudents;
    }

    public static Student[] deleteStudent(Student[] students, int id){
        //＿φ(．．*)1.增强for循环是局部变量，不能直接修改数组元素的值
//        for (Student s: students) {
//            if(s.getId()==id){
//                s = null;
//                System.out.println("删除成功");
//                return students;
//            }
//        }
        for (int i = 0; i < students.length; i++) {

            //＿φ(．．*)2.注意这里的非空检查，避免空指针异常
            //＿φ(．．*)3.另外注意这里使用短路与，在空指针时直接短路，不再继续判断后续条件（id是否等于id）
            if(students[i] != null && students[i].getId()==id){
                students[i]=null;
                System.out.println("删除成功");
                return students;
            }
        }
        System.out.println("未找到该学生");
        return students;
    }

    public static Student[] queryStudentAndUpdateAgeBy1(Student[] students, int id){
        for (int i = 0; i < students.length; i++) {
            if(students[i]!=null && students[i].getId()==id){
                students[i].setAge(students[i].getAge()+1);
                System.out.println("年龄更新成功");
                return students;
            }
        }
        System.out.println("未找到该学生");
        return students;
    }
}
