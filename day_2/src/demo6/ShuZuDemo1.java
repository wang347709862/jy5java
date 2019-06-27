package demo6;

public class ShuZuDemo1 {
    public static void main(String[] args) {
//        创建一个容器，用来放每个同学的手机
        int[] a = new int[23];
//        a[0] = 10;
//        System.out.println(a[0]);
//        a[22] = 50;
//        System.out.println(a[22]);
//        int m = a.length;
//        System.out.println(m);

        for(int i = 0;i<23;i++){
            a[i] = i;
        }

        System.out.println("===================");

        for(int i = 0;i<23;i++){
            System.out.println(a[i]);
        }

        String[] b = new String[5];
    }
}
