package testDemo;

import foods.HunDish;
import foods.SuDish;
import foods.ZhuFood;
import sites.CanJu;
import sites.DiRoom;
import sites.ZuoWei;
import users.Student;
import users.Works;

public class Test1 {
    //程序的主入口
    public static void main(String[] args) {
        //吃饭的用户，工作的员工

        Student s1 = new Student("赵世雄",0,10,2_1,25);

        Works w1 = new Works("打饭阿姨",1,100);
        Works w2 = new Works("收费小哥",0,101);
        Works w3 = new Works("清理阿姨",1,102);

        //餐厅，餐具，食物
        DiRoom dr = new DiRoom();
        dr.dName = "楼下餐厅";
        dr.mj = 1000;
        dr.dNum = 500;
        dr.dTime = "8:00~19:00";
        dr.zuo = new ZuoWei("木头","米白色");
        //放入餐具
        CanJu[] cc = new CanJu[5];
        cc[0] = new CanJu("筷子","木头","夹菜");
        cc[1] = new CanJu("叉子","木头","夹菜");
        cc[2] = new CanJu("盘子","木头","夹菜");
        cc[3] = new CanJu("碗","木头","夹菜");
        cc[4] = new CanJu("勺子","木头","夹菜");
        dr.cj = cc;
        //准备食物
        ZhuFood zh1 = new ZhuFood("米饭",1.5,'香');
        ZhuFood zh2 = new ZhuFood("馒头",0.5,'甜');
        //准备菜
        SuDish sd1 = new SuDish("凉拌菠菜",1.0,'咸');
        SuDish sd2 = new SuDish("红烧茄子",2.0,'甜');
        SuDish sd3 = new SuDish("拌黄瓜",1.0,'脆');
        HunDish hd1 = new HunDish("萝卜海带排骨汤",5.0,'鲜');
        HunDish hd2 = new HunDish("大盘鸡",10.0,'辣');

        //谁去吃饭？
        System.out.print(s1.name);
        s1.eat();
        //去哪里吃饭？
        //吃什么饭？
        //用什么餐具？

    }
}
