package testdemo;

import pojo.User;

public class GuanLi {
    //存放用户对象的数组
    User[] u;
    //银行的属性初始化


    //用户注册方法
    public static User one(String s, long l, int a) {
        User u = new User();
        u.setName(s);
        u.setZh(l);
        u.setMima(a);
        return u;
    }

    //用户登录的方法
    public static void login(long l, int a, User[] us, User ul) {
        //查找是否有该用户
        for (int i = 0; i < us.length; i++) {
            if (us[i] == null) {
                continue;
            }
            if (us[i].getZh() == l && us[i].getMima() == a) {
                //赋值给公共账户
                ul = new User();
                ul.setZh(l);
                ul.setMima(a);
            }
        }
    }

    //用户存钱方法
    public static void cunqian(long l, int money, User[] us) {
        //查找用户
        for (int i = 0; i < us.length; i++) {
            if (us[i] == null) {
                continue;
            }
            if (us[i].getZh() == l) {
                us[i].setMon(us[i].getMon()+money);
            }
        }
    }
    //用户取钱方法
    public static boolean quqian(User ul, int money, User[] us) {
        boolean b = false;
        //查找用户
        for (int i = 0; i < us.length; i++) {
            if (us[i] == null) {
                continue;
            }
            if (ul.getZh() == us[i].getZh()) {
                //取钱超过金额
                if(money>us[i].getMon()){
//                    System.out.println("账户余额不足！");
                }else{
                    us[i].setMon(us[i].getMon()-money);
                    b = true;
                }

            }
        }
        return b;
    }

    //用户转账方法
    public static boolean zhuan(long l3, User ul, User[] us,int mon) {
        boolean b = false;
        //不能给自己转账
        if (ul.getZh() == l3) {
            System.out.println("不能给自己转账");
            return b;
        }

        //判断要转账的账户是否存在
        for (int i = 0; i < us.length; i++) {
            if (us[i] == null) {
                continue;
            }
            if (us[i].getZh() == l3) {
                break;
            } else {
                System.out.println("要转账的用户不存在！");
                return b;
            }
        }

        //正常转账
        //当前用户扣钱
        b = quqian(ul,mon,us);
        if(b){
            //被转用户存钱
            cunqian(l3,mon,us);
        }else{
            System.out.println("账户余额不足！");
            return b;
        }

        return b;
    }

    //循环给数组赋值
    //循环取值
}
