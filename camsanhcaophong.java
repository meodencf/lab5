
package huong_doi_tuong;



public class camsanhcaophong extends camsanh{
    public String location;

    public camsanhcaophong(int so_luong, double gia_ban, String nguongocxuatxu, String ngaynhap, String color, String taste,String location) {
        super(so_luong, gia_ban, nguongocxuatxu, ngaynhap, color, taste);
        this.location=location;
    }

}
