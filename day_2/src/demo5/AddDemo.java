package demo5;

import java.util.Scanner;

public class AddDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你名字笔画的数字：");
        int ljp = sc.nextInt();
        System.out.println("请再输入一个你喜欢的人的名字笔画的数字：");
        int ly = sc.nextInt();

        int yfz = qiuYuan(ljp,ly);
        System.out.println("你们的缘分是："+yfz+"%");
    }

//    测算两个人的缘分
    public static int qiuYuan(int a,int b){
        int num = a+b;
        return num;
    }
}
