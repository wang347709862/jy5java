package demo2;

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int aa = sc.nextInt();
        int bb = sc.nextInt();


        if(aa%2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }

        if(bb%2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
