package GV;

import java.util.Scanner;

public class GVCH extends GV{
    private int LuongThoaThuan;
    private int LuongThuong;
    private int SoGioLamViecTrongThang;

    public GVCH() {
        LuongThoaThuan=3000000;
        LuongThuong=50000;
        InputGV();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so gio lam viec trong thang cua GVCH: ");
        SoGioLamViecTrongThang=sc.nextInt();
    }

    @Override
    public void OutputGV(){
        OutputInfo();
        System.out.println(new StringBuilder().append("Luong: ").append(String.valueOf(TinhLuong())).toString());
    }

    @Override
    public int TinhLuong(){
        if(SoGioLamViecTrongThang>40)
            return LuongThoaThuan+LuongThuong;
        return LuongThoaThuan;
    }


}
