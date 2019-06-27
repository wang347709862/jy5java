package demo5;

import java.util.Scanner;

public class JiSuanJiDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = add(a,b);
        System.out.println("和是："+n);

    }

//    计算多个数字的和的计算器
    public static int add(int a,int b){
        return a+b;
    }
//    public static int add(int b,int a){
//        return a+b;
//    }

    public static int add(int a,int b,int c){
        return a+b+c;
    }

    public static int add(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static long add(byte a,int b){
        return a+b;
    }
    public static long add(int a,byte b){
        return a+b;
    }


}
