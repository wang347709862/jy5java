package week_2;

public class CeshiDemo {
    public static void main(String[] args){
        int x = 2,y=3;

        switch(x)
        {
            default:
                y++;
            case 3:
                y++;
                break;
            case 4:
                y++;
        }

        System.out.println("y="+y);
    }
}
