package demo1;

public class SanMudemo {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
//        String ss = (a>b)?"大于":"小于";
//        System.out.println(ss);

        int c = (a++ > b--)?--a:++a;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
    }
}
