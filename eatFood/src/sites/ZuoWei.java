package sites;

public class ZuoWei {
   /* 属性：
    材质
            颜色
    形状*/


   private String caiZhi;
   private String color;

   //
   public String getCaiZhi() {
      return caiZhi;
   }

   public void setCaiZhi(String caiZhi) {
      this.caiZhi = caiZhi;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public ZuoWei(){}
   public ZuoWei(String caiZhi,String color){
      this.caiZhi = caiZhi;
      this.color = color;
   }
}
