package users;

public class Student extends Person {
    public static String className = "JY5";
    private int zuoWei;
    private int id;
    public static String work = "学生";

    //
    public String getClassName() {
        return className;
    }

    public int getZuoWei() {
        return zuoWei;
    }

    public void setZuoWei(int zuoWei) {
        this.zuoWei = zuoWei;
    }

    public String getWork() {
        return work;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //都能访问的构造方法
    public Student() {

    }

    public Student(String name, int sex, int eatTime, int zuoWei, int id) {
        this.name = name;
        this.sex = sex;
        this.eatTime = eatTime;
        this.zuoWei = zuoWei;
        this.id = id;
    }

    //
    public void lk() {
        System.out.println(this.name+"在听课");
    }

    public void study() {
        System.out.println(this.name+"在学习");
    }

    public void pGame() {
        System.out.println(this.name+"在玩游戏");
    }

    //从父类继承的方法，有些不太适合，我需要有自己的特性

    @Override
    public void eat() {
        System.out.println("学生在吃饭");
    }
}
