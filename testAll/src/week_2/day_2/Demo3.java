package week_2.day_2;

public class Demo3 {
    public static void main(String[] args) {
//        有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？

        //每次取一个数，拿到1、2、3、4

//        int a;
//        int a=0;

        int n = getNum();
        System.out.println(n);

        int m = getNum1();
        System.out.println(m);
    }


//    把上面的代码变成一个公共的方法
    public static int getNum(){
        int n = 0;

        for(int i = 1;i<=4;i++){
            //百位的数字确定了，接下来要确定十位的数字
            for(int j = 1;j<=4;j++){
                //确定十位的数字,十位数字和百位数字相同吗？
                if(j == i){
                    continue;
                }

                //取个位数字
                for(int m = 1;m<=4;m++){
                    if(m == j || m == i){
                        continue;
                    }
                    n++;
                }
            }
        }
        return n;
    }

    public static int getNum1(){
        int n = 0;

        //我不管你重不重复，我先拿出一个三位数
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=4;j++){
                for(int m = 1;m<=4;m++){
                    if(m != j && m != i && j != i){
                        n++;
                    }
                }
            }
        }
        return n;
    }

    public static int getNum2(){
        int n = 0;
       int[] a = new int[4];
       a[0] = 1;
       a[1] = 2;
       a[2] = 3;
       a[3] = 4;

       return n;
    }
}
