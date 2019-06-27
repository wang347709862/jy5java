package week_2.day_3;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        //判断一个数字的位数
        Scanner sc = new Scanner(System.in);

        //999
        int a = sc.nextInt();

       /* int m = a/10;//99
        m = m/10;//9
        m = m/10;//0*/

        int m = 0;
        m = a / 10;
   /*     if (m == 0) {
            System.out.println("一位数");
        }else{
            m = m / 10;
            if (m == 0) {
                System.out.println("二位数");
            }else{
                m = m / 10;
                if (m == 0) {
                    System.out.println("三位数");
                }
            }
        }
*/

   /*==============================================*/
        /*for (int i = 1; i <=10 ; i++) {
            if(m == 0){
                System.out.println("这是一个"+i+"位数");
                break;
            }else{
                m = m/10;
            }
        }*/

        int n = 1;
        while (m != 0){
            m = m/10;
            n++;
        }
        System.out.println(n);
    }
}
