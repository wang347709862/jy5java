package week_2.day_2;

public class Demo2 {
    public static void main(String[] args) {
//        1．有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...   求出这个数列的前20项之和。
//        分析：分子=前一个数的分子+分母
//              分母=请一个数的分子

        //定义分子
        int fz = 2;
        //定义分母
        int fm = 1;
        //写出原始规则
        double m = fz/fm;
        //定义一个中间变量，来存储之前分母的值
        int n = 0;


        //循环去改变分母和分子的值，来得到每一个数字
        for (int i = 0; i <20 ; i++) {
            n = fz;
            fz = fz+fm;
            fm = n;
            m = m+fz/fm;
        }

        //输出和
        System.out.println("前20项的和是："+m);

    }
}
