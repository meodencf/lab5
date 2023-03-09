/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huong_doi_tuong;

/**
 *
 * @author MINHNHAT
 */
public class QuaCam extends hoaqua{
    public String color;
    public QuaCam(int so_luong,double gia_ban,String nguongocxuatxu,String ngaynhap,String color){//ca cha lan con
    super(so_luong,gia_ban,nguongocxuatxu,ngaynhap); //property lop cha
    this.color=color;
}
}
