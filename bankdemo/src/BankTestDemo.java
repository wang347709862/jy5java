import pojo.Bank;
import pojo.User;
import testdemo.GuanLi;
import view.Welcome;

import java.util.Scanner;

public class BankTestDemo {
    public static void main(String[] args) {
        //键盘录入准备
        Scanner sc = new Scanner(System.in);

        //录入银行信息,并返回录入好的银行对象
        Bank b = Welcome.zb(sc);

        //准备存放用户对象的数组,存放多少用户由银行容量决定
        User[] us = new User[b.getYhNum()];


//        =========================================
//        业务开始


        //记录用户选择功能
        int num = 0;
        //记录登录的用户
        User ul = null;

        while (num != 9) {
            Welcome.sy(b.getName());
            //获取用户选择的功能
            num = sc.nextInt();

            //设置循环操作
            int num2 = num;
            switch (num2) {
                case 1:
                    while (num2 != 9) {
                        System.out.println("请输入用户名：");
                        String s = sc.next();
                        System.out.println("请输入用户账号：");
                        Long ll = sc.nextLong();
                        System.out.println("请输入用户密码：");
                        int mm = sc.nextInt();
                        User u = GuanLi.one(s, ll, mm);
                        //把用户对象放入数组
                        for (int i = 0; i < us.length; i++) {
                            if (us[i] != null) {
                                us[i] = u;
                            }
                        }
                        System.out.println("是否继续注册用户？");
                        System.out.println("1.是");
                        System.out.println("9.否");
                        num2 = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("请登录账户：");
                    long l1 = sc.nextLong();
                    System.out.println("请输入密码：");
                    int a1 = sc.nextInt();
                    GuanLi.login(l1, a1, us, ul);
                    break;
                case 5:
                    while (num2 != 9) {
                        //判断用户是否登录
                        if (ul == null) {
                            System.out.println("请登录账户：");
                            long l2 = sc.nextLong();
                            System.out.println("请输入密码：");
                            int a2 = sc.nextInt();
                            ul = new User();
                            ul.setZh(l2);
                            ul.setMima(a2);
                            GuanLi.login(l2, a2, us, ul);
                        }

                        //如果用户已经登录
                        System.out.println("请输入要转账的账户：");
                        long l3 = sc.nextLong();
                        System.out.println("请输入要转入的金额：");
                        int mon = sc.nextInt();
                        boolean bl = GuanLi.zhuan(l3, ul, us, mon);
                        System.out.println("是否继续转账？");
                        System.out.println("1.是");
                        System.out.println("9.否");
                        num2 = sc.nextInt();
                    }
                    break;
            }
        }

    }
}
