package demo1;

public class TestDemo3 {
    int a;
    int b;

    public void show(int a){
        this.a = a;
        a = 20;
        int b = 100;
        System.out.println("一："+a);
        System.out.println("二："+a);
        System.out.println("三："+this.b);

    }
}
