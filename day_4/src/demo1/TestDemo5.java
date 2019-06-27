package demo1;

public class TestDemo5 {
    public static void main(String[] args) {
        int[] a = new int[5];

        TestDemo5 td = new TestDemo5();
//        new TestDemo5();
       /* td.addNum(a);
        td.sortNum(a);*/

        System.out.println("================");

        int[] b = new int[10];
        /*td.addNum(b);
        td.sortNum(b);*/

        //一个疑问？
        td.xiugai(a);
//        System.out.println(a[2]);

        int m = 10;
        System.out.println(m);
        td.xg(m);
        System.out.println(m);


    }

    public void addNum(int[] a){
        //放数字
        for(int i = 0;i<a.length;i++){
            a[i] = i;
        }
    }

    public void sortNum(int[] a){
        //遍历数组
        for (int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void xiugai(int[] a){
        a[2] = 10;
    }

    public void xg(int m){
        m = 20;
    }
}
