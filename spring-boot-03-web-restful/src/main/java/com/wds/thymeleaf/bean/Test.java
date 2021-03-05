package com.wds.thymeleaf.bean;

import java.util.HashSet;

public class Test {

    private static String I = "111";

    private int i;

    public void geti(){
        System.out.println(i);
    }

    public static class Test2{

        public static void getI(){
            System.out.println(I);
        }
    }

    public static void main(String[] args){
        Test2.getI();
        new Test().geti();
    }
}
