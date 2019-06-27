package demo1;

public class HandDemo {
    //属性
    String yanse;
    int daxiao;
    int fenlei;
    String name;
    String caizhi;

    //行为
    public static void zhanShi() {
        System.out.println("用来展示");
    }

    public static void shouCang() {
        System.out.println("用来收藏");
    }

    public static void paiMai() {
        System.out.println("用来拍卖");
    }

    //
    HandDemo() {
        System.out.println("手工艺品的构造方法被调用了！");
    }
}
