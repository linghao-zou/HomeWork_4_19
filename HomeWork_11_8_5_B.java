package com.linghao.programming;

/**
 * @author zoulinghao
 * @create 2021-04-19-17:37
 * @Description If you have any questions about my code,
 * please email to linghaozou@163.com
 */
public class HomeWork_11_8_5_B {
    public static void main(String[] args) {
        new Person().printPerson();//person
        new Student().printPerson();//person
//        Student student1=new Student();
//        Person person1=student1;
//        Person person = new Person();
//        Student student=(Student)person;

    }
}
class Student extends Person{
    private String getInfo() {
        return "student";
    }
}
class Person{
    private String getInfo(){
        return "person";
    }
    public void printPerson(){
        System.out.println(getInfo());
    }
}
