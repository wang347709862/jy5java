package demo2;

import java.util.Scanner;

public class IfDemo4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个值：");

        int x = sc.nextInt();
        int y = 0;

        /*需求：
        键盘录入x的值，计算出y的并输出。

        x>=3	y = 2x + 1;
        -1<=x<3	y = 2x;
        x<=-1	y = 2x – 1;*/

        if(x>=3){
            y = 2*x + 1;
        }

        if(-1<=x && x<3){
            y = 2*x;
        }

        if(x<=-1){
            y = 2*x - 1;
        }

        System.out.println(y);
    }
}
