package demo1;

public class TestDemo1 {
    public static void main(String[] args) {
        //创建了一只纸鹤
        ZhiHeDemo zh1 = new ZhiHeDemo();

        //这里需要先给这只纸鹤的属性一些值
        zh1.name = "心形纸鹤";
        zh1.daxiao = 2;

        //它有哪些具体的属性和行为啊？
        String zh1Name = zh1.name;
        int i = zh1.daxiao;

//        zh1.

        //拿出来看看是什么样的纸鹤啊？
        System.out.println("纸鹤的名字："+zh1Name);
        System.out.println("纸鹤的大小："+i);

        System.out.println("====================================");
        //再创建一只纸鹤
        ZhiHeDemo zh2 = new ZhiHeDemo("五福纸鹤",3);

        System.out.println("纸鹤的名字："+zh2.name);
        System.out.println("纸鹤的大小："+zh2.daxiao);
    }
}
