package com.linghao.programming;

/**
 * @author zoulinghao
 * @create 2021-04-19-17:34
 * @Description If you have any questions about my code,
 * please email to linghaozou@163.com
 */
public class HomeWork_11_8_4 {
    public static void main(String[] args) {
        Integer[] list1={12,24,55,1};
        Double[] list2={12.4,24.0,55.2,1.0};
        int[] list3={1,2,3};
        printArray(list1);
        printArray(list2);
//        printArray(list3);
    }
    public static void printArray(Object[] list){
        for (Object o:
             list) {
            System.out.println(o+" ");
        }
        System.out.println();
    }
}
