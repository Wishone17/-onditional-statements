package com.abubekerov;

public class Main {
    public static void main(String[] args) {
        byte typeByte = 17;
        short typeShort = 1000;
        int typeInt = 2000000;
        long typeLong = 300000000000L;
        float typeFloat = 35.22f;
        double typeDouble = 47.65;
        char typeChar = 'a';
        boolean typeBoolean = true;
        String str = "Hello";

        }
    public static int method1(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    public static boolean method2(int a, int b){
        if((a+b) > 9 && (a+b) < 21)
            return true;
        else
            return false;
    }

    public static void method3 (int a){
        if(a >= 0)
            System.out.println("Введенное число - положительное");
        else
            System.out.println("Введенное число - отрицательное");
    }

    public static boolean method4(int a){
        return a < 0;
    }

    public static void method5(String a){
        System.out.println("Привет, " + a + "!");
    }

    public static void method6(int a){
        if (a % 4 == 0)
            if (a % 100 == 0)
                if (a % 400 == 0)
                    System.out.println("год является високосным");
                else
                    System.out.println("год не является високосным");
            else
                System.out.println("год является високосным");
        else
            System.out.println("год не является високосным");
    }

}
