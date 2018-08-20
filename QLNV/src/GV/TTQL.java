package GV;

import java.util.ArrayList;
import java.util.Scanner;

public class TTQL {
    private ArrayList<GV> gv;
    private ArrayList<GV> gvch;
    private ArrayList<GV> gvtg;
    private int luongch;
    private int luongtg;

    public TTQL() {
        gv=new ArrayList<GV>();
        gvch=new ArrayList<GV>();
        gvtg=new ArrayList<GV>();
        luongch=0;
        luongtg=0;
    }

    public void Nhap(){
        int i=0;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so GV can nhap: ");
        count=sc.nextInt();
        int j=0;

        while (j<count){
        System.out.println("Nhap 1 la GVCH, 0 la GVTG");

        i=sc.nextInt();
        GV GiaoVien;

        switch (i){
            case 1:
                GiaoVien=new GVCH();
                gvch.add(GiaoVien);
                break;
            default:
                GiaoVien=new GVTG();
                gvtg.add(GiaoVien);
                break;
        }
        gv.add(GiaoVien);
        j++;
        }
    }

    public void Xuat(){
        for(int i=0; i<gv.size(); i++){
            gv.get(i).OutputGV();
        }
    }

    public void XuatGVCH(){
        for(int i=0; i<gvch.size(); i++){
            luongch+=gvch.get(i).TinhLuong();
            gvch.get(i).OutputGV();
        }
    }

    public void XuatGVTG(){
        for (int i=0; i<gvtg.size(); i++){
            luongtg+=gvtg.get(i).TinhLuong();
            gvtg.get(i).OutputGV();
        }
    }

    public int TongLuongGV(){
        int luong=0;
        for(int i=0; i<gv.size(); i++){
            luong+=gv.get(i).TinhLuong();
        }
        return luong;
    }

    public void LoaiGvCaoNhat(){
        if(luongtg<luongch)
            System.out.println("GVCH co so luong cao nhat");
        else if(luongch==luongtg){
            System.out.println("GVCH va GVTG bang nhau");
        }
        else {
            System.out.println("GVTG cao hon GVCH");
        }
    }

}
