package GV;

import java.util.Scanner;

public abstract class GV {
    private String HoTen;
    private String email;
    private String SDT;
    private String DiaChi;

    public GV() {
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getEmail() {
        return email;
    }

    public String getSDT() {
        return SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void InputGV(){
        System.out.println("Nhap thong tin:");
        Scanner sc=new Scanner(System.in);
        HoTen=sc.nextLine();
        email=sc.nextLine();
        SDT=sc.nextLine();
        DiaChi=sc.nextLine();
    }

    public void OutputInfo(){
        System.out.println(HoTen+"\n"+email+"\n"+SDT+"\n"+DiaChi);
    }

    public abstract void OutputGV();

    public abstract int TinhLuong();
}
