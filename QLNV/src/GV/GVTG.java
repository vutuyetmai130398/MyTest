package GV;

import java.util.Scanner;

public class GVTG extends GV{
    private int SoGioLamViecTrongThang;

    public GVTG() {
        InputGV();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so gio lam viec cua GVTG: ");
        SoGioLamViecTrongThang=sc.nextInt();
    }

    @Override
    public void OutputGV(){
        OutputInfo();
        System.out.println(new StringBuilder().append("Luong: ").append(String.valueOf(TinhLuong())).toString());
    }

    @Override
    public int TinhLuong(){
        return 200*SoGioLamViecTrongThang;
    }
}
