package huong_doi_tuong;

public class quatao extends hoaqua{
    public String type;
    public quatao(int so_luong,double gia_ban,String nguongocxuatxu,String ngaynhap,String type){//ca cha lan con
    super(so_luong,gia_ban,nguongocxuatxu,ngaynhap); //property lop cha
    this.type=type;
}
}
