package sites;

public class CanJu {
    /*属性：
    名字
            材质
    形状
            颜色
    数量
            种类
    功用*/

    private String cName;
    private String caiZhi;
    private String gy;

    //


    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getCaiZhi() {
        return caiZhi;
    }

    public void setCaiZhi(String caiZhi) {
        this.caiZhi = caiZhi;
    }

    public String getGy() {
        return gy;
    }

    public void setGy(String gy) {
        this.gy = gy;
    }

    public CanJu() {
    }

    public CanJu(String cName, String caiZhi, String gy) {
        this.caiZhi = caiZhi;
        this.cName = cName;
        this.gy = gy;
    }

}
