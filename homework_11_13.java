package com.linghao.programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author zoulinghao
 * @create 2021-04-19-17:18
 * @Description If you have any questions about my code,
 * please email to linghaozou@163.com
 */
public class homework_11_13 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner in=new Scanner(System.in);
        System.out.println("Please Enter 10 number");
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }
        homework_11_13.removeDuplicate(list);
        System.out.println("after removeDuplicate list=:");
        System.out.println(list);

    }
    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if (list.get(i)==list.get(j) && i!=j){
                    list.remove(j);
                }
            }
        }

    }
}
