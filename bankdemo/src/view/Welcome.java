package view;

import pojo.Bank;

import java.util.Scanner;

public class Welcome {

    //录入信息页面
    public static Bank zb(Scanner sc){
        Bank b = new Bank();
        System.out.println("请输入银行名称：");
        b.setName(sc.next());
        System.out.println("请输入银行可开户人数：");
        b.setYhNum(sc.nextInt());

        return b;
    }



    //首页
    public static void sy(String n){
        System.out.println("欢迎光临"+n);
        System.out.println("请选择要办理的业务：");
        System.out.println("1.开户");
        System.out.println("2.登录");
        System.out.println("3.寸钱");
        System.out.println("4.取钱");
        System.out.println("5.转账");
        System.out.println("9.离开");
    }


}
