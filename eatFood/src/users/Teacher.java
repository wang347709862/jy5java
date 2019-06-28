package users;

public class Teacher extends Person{
    private String km;
    private int bId;

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }



    public void sk(){

        System.out.println("在讲课");
    }

    public void bk(){
        System.out.println("在备课");
    }
}
