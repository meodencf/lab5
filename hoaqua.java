
package huong_doi_tuong;

public class hoaqua {
    //property   
    
  public int soluong;
  public double giaban;
  public String nguongocxuatxu;
  public String ngaynhap;
 
  //methot k tham so
  public hoaqua(){
  }
      //method co tham so
  public hoaqua(int soluong,double giaban,String nguongocxuatxu,String ngaynhap){
      this.soluong=soluong;
      this.giaban=giaban;
      this.nguongocxuatxu=nguongocxuatxu;
      this.ngaynhap=ngaynhap;
  }
         //get tra ve gia tri
  public int getsoluong(){
      return this.soluong;
  }
  public double getgiaban(){
      return this.giaban;
  }
  String getnguongocxuatxu(){
      return this.nguongocxuatxu;
  }
  String getngaynhap(){
      return this.ngaynhap;
  }
  //set thay doi gia tri
  public void setso_luong(int so_luong){
      this.soluong=so_luong;
  }
  public void setgia_ban(double gia_ban){
      this.giaban=gia_ban;
  }
  public void setnguongocxuatxu(String nguongocxuatxu){
      this.nguongocxuatxu=nguongocxuatxu;
  }
  public void setngaynhap(String ngaynhap){
      this.ngaynhap=ngaynhap;
  }
  @Override
  public String toString(){
      return "(ngaynhap:"+ getngaynhap()+")";
  }
}