package demo2;

public class IfDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        if (a > b) {
            System.out.println("两个数字中a比较大");
        }else if(a>c){
            System.out.println("两个数字中b比较大");
        }

        System.out.println("判断结束");
    }
}
