package demo1;

public class ZiZengDemo {
    public static void main(String[] args){
        int a = 1;
       /* a--;
        System.out.println("第一次："+a);
        --a;
        System.out.println("第二次："+a);*/

        System.out.println(a++ + ++a + (--a - a--));
        System.out.println(a);
    }
}
