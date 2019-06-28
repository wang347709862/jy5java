package demo1;


public class ZhanShi {

    {
        System.out.println("这是普通代码块");
    }
    static {
        System.out.println("这是静态代码块");
    }


    private String name;
    private int sex;
    public static int ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void attack() {
        System.out.println(this.name + "战士在攻击！");
    }

    public ZhanShi(){
        System.out.println("使用构造方法");
    }
}
