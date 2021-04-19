package com.linghao.programming;

import java.util.ArrayList;

/**
 * @author zoulinghao
 * @create 2021-04-19-17:22
 * @Description If you have any questions about my code,
 * please email to linghaozou@163.com
 */
public class homework_11_18 {
    public static void main(String[] args) {
        ArrayList<Character> abc = homework_11_18.toCharacterArray("abc");
        System.out.println(abc);
    }
    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> characters = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            characters.add(s.charAt(i));
        }
        return characters;
    }
}
