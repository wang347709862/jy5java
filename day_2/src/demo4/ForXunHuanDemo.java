package demo4;

public class ForXunHuanDemo {
    public static void main(String[] args){
        //输出十句 我爱Java
        for(int i = 0;i<10;i++){
            System.out.println("我爱java");
        }

        System.out.println("=============================");

        int i = 0;

        while(i<10){
            System.out.println("我爱java"+i);
            i++;
        }

        System.out.println("================"+i);


        int j = 0;

        do{
            System.out.println("我爱Java"+j);
            j++;
        }while (j<10);
    }
}
