package week_2.day_3;

public class Demo2 {
    public static void main(String[] args) {

        //第一种情况
        String a = "1";
        String b = "1";
//        System.out.println(a == b);

        //2
        String c = "ok";
        String d = "ok";
//        System.out.println(c == d);

        //3
        String e = "1u1";
        String f = e;

//        System.out.println(e == f);

        //
        String g = "java";
        System.out.println(g == "java");
        System.out.println(g.equals("java"));


    }
}
