package demo1;

public class TestDemo4 {
    public static void main(String[] args) {
        TestDemo3 t3 = new TestDemo3();
        TestDemo3 t4 = new TestDemo3();

        int a = 10;

        t3.show(a);
        t4.show(a);

        System.out.println(a);
    }
}
