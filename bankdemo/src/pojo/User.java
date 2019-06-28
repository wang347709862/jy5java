package pojo;

public class User {
    private String name;
    private long zh;
    private int mima;
    private int mon=100;

    public int getMon() {
        return mon;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getZh() {
        return zh;
    }

    public void setZh(long zh) {
        this.zh = zh;
    }

    public int getMima() {
        return mima;
    }

    public void setMima(int mima) {
        this.mima = mima;
    }
}
