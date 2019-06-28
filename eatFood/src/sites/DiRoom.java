package sites;

public class DiRoom {
    /*属性：
    面积
            名字
    容纳人数
            营业时间*/

    private int mj;
    private String dName;
    private int dNum;
    private String dTime;

    //这里是数据类型为类的属性
    private CanJu[] cj;
    private ZuoWei zuo;

    //

    public int getMj() {
        return mj;
    }

    public void setMj(int mj) {
        this.mj = mj;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public int getdNum() {
        return dNum;
    }

    public void setdNum(int dNum) {
        this.dNum = dNum;
    }

    public String getdTime() {
        return dTime;
    }

    public void setdTime(String dTime) {
        this.dTime = dTime;
    }

    public CanJu[] getCj() {
        return cj;
    }

    public void setCj(CanJu[] cj) {
        this.cj = cj;
    }

    public ZuoWei getZuo() {
        return zuo;
    }

    public void setZuo(ZuoWei zuo) {
        this.zuo = zuo;
    }


    //行为：

}
