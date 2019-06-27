package users;

public class Student extends Person{
    public String className = "JY5";
    public int zuoWei;
    public int id;
    public String work = "学生";

    //都能访问的构造方法
    public Student(){

    }
    public Student(String name,int sex,int eatTime,int zuoWei,int id){
        this.name = name;
        this.sex = sex;
        this.eatTime = eatTime;
        this.zuoWei = zuoWei;
        this.id = id;
    }

    //
    public void lk(){
        System.out.println("在听课");
    }

    public void study(){
        System.out.println("在学习");
    }

    public void pGame(){
        System.out.println("在玩游戏");
    }
}
