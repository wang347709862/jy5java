package demo1;

public class FaShi {
    //属性
    private String name;
    private int height;
    private int fq;

    //行为
    public void mofa(String n) {
        System.out.println(n + "法师正在使用魔法");
    }

    //给私有化的属性提供外界可以操作它的方法
    public int getHeight() {
        return this.height;
    }

    public void setHeight(int a) {
        this.height = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFq() {
        return fq;
    }

    public void setFq(int fq) {
        this.fq = fq;
    }
}
