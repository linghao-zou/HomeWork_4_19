package com.linghao.programming;

import java.util.ArrayList;

/**
 * @author zoulinghao
 * @create 2021-04-19-21:30
 * @Description If you have any questions about my code,
 * please email to linghaozou@163.com
 */
public class HomeWork_11_10_2 {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        Circle circle2=new Circle();
        System.out.println(circle1.equals(circle2));//true
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(0,1);
        objects.add(0,2);
        objects.remove(objects.size()-1);
        System.out.println(objects.contains(2));
        System.out.println(objects);
    }
}
//class Circle{
//    double radius;
//    public boolean equals(Object circle){
//        return this.radius==((Circle)circle).radius;
//    }
//}
class Circle{
    double radius;
    public boolean equals(Circle circle){
        return this.radius==circle.radius;
    }
}
