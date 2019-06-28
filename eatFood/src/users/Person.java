package users;

public class Person {
    /*属性：
    姓名
    性别
    职业
    吃饭方式
    吃饭时间*/

    public String name;
    public int sex; //0代表男，1代表女
    public String work;
    //    String eatF;
    public int eatTime = 10; //吃饭时间以分钟为单位


    /*行为：
    吃
    玩
    睡*/

    public void eat() {
        System.out.println("在吃饭");
    }

    public void play() {
        System.out.println("玩游戏");
    }

    public void sleep() {
        System.out.println("睡觉");
    }


}
