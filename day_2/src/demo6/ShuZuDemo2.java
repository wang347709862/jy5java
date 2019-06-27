package demo6;

public class ShuZuDemo2 {
    public static void main(String[] args) {
        int[][] a = new int[4][8];
//        System.out.println(a.length);
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<8;j++){
                a[i][j] = 0;
            }
        }

        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<8;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

}
