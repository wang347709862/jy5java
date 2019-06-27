package demo1;


public class TestDemo {

    public static void main(String[] args) {
        //创建一个射手类英雄
        SheShouDemo ss;
        ss = new SheShouDemo();

        //给对象的成员变量赋值
        ss.name = "寒冰射手";
        ss.height = 175;
        ss.sex = "女";

        ss.name = "蛮王";
        ss.sex = "男";
        //看看这个英雄对象
        System.out.println("射手的名字是："+ss.name);

        //这里不能都是一样的攻击效果！
        ss.attack();

        System.out.println("=======================");

        int a = 180;
        ss.height = a;
    }

    public void aaa(int a){
        System.out.println(a);
    }

//    public void bbb(){
//        System.out.println(a);
//    }
}
