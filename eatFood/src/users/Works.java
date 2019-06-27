package users;

public class Works extends Person {
    String bm = "餐饮部";
    int wId;
    String company = "景田餐饮";
    String work = "食堂员工";

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
