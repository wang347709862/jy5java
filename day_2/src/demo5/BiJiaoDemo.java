package demo5;

import java.util.Scanner;

public class BiJiaoDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        接收一下同学年龄
        System.out.println("请输入第一个同学的年龄：");
        int a = sc.nextInt();
        System.out.println("请输入第二个同学的年龄：");
        int b = sc.nextInt();

//        比较年龄大小
        int c = bj(a,b);
        System.out.println("两个同学中年龄大的同学年龄是："+c);
    }

//    比较两个同学的年龄大小
    public static int bj(int a,int b){
        if(a>b){
           return a;
        }else{
            return b;
        }
    }
}
