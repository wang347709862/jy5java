package users;

public class Works extends Person {
    public String bm = "餐饮部";
    private int wId;
    public static String company = "景田餐饮";
    public String work = "食堂员工";

    //
    public void setwId(int a){
        this.wId = a;
    }
    public int getwId(){
        return this.wId;
    }

    //构造方法
    public Works() {
    }

    public Works(String hhhh, int sex, int wId) {
        this.name = hhhh;
        this.sex = sex;
        this.wId = wId;

    }

    public void df() {
        System.out.println("在打饭");
    }

    public void sf() {
        System.out.println("在收费");
    }

    public void ql() {
        System.out.println("在清理");
    }
}
