package sesstion2.Fraction;

import java.util.Scanner;

public class Fraction {
    int tu,mau;

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    public void nhap(){
        int tuso,mauso;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập tử số: ");
            tuso = sc.nextInt();
            System.out.println("Nhập mẫu số: ");
            mauso = sc.nextInt();
            if (mauso == 0){
                System.out.println("Nhập lại...");
            }
        }while (mauso == 0);
        tu = tuso;
        mau = mauso;
    }
    public void in(){
        if (mau == 1){
            System.out.println(tu);
        }
        else {
            System.out.println(tu + "/" + mau);
        }
    }

    public void RutGon(){
        //Ucln
        int a = getTu();
        int b = getMau();
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        // Toi gian phan so
        tu /= b;
        mau /= b;
        if (mau == 1){
            System.out.println("\t\t\t" + tu);
        }
        else {
            System.out.println("\t\t\t" + tu + "/" + mau);
        }
    }

    public void Dao(){
        if (tu == 1){
            System.out.println("\t\t\tNghịch Đảo = " + mau);
        }
        else {
            System.out.println("\t\t\tNghịch Đảo = " + mau + "/" + tu);
        }
    }

    public  Fraction add(Fraction ps1, Fraction ps2) {
        Fraction Tong = new Fraction();
        if (ps1.mau == ps2.mau){
            Tong.tu = ps1.tu + ps2.tu;
            Tong.mau = ps1.mau;
        }
        else {
            Tong.tu = ps1.tu * ps2.mau + ps1.mau * ps2.tu;
            Tong.mau = ps1.mau * ps2.mau;
        }
        return Tong;
    }
    public  Fraction sub(Fraction ps1, Fraction ps2) {
        Fraction Hieu = new Fraction();
        if (ps1.mau == ps2.mau){
            Hieu.tu = ps1.tu - ps2.tu;
            Hieu.mau = ps1.mau;
        }
        else {
            Hieu.tu = ps1.tu * ps2.mau - ps1.mau * ps2.tu;
            Hieu.mau = ps1.mau * ps2.mau;
        }
        return Hieu;
    }
    public  Fraction mul(Fraction ps1, Fraction ps2) {
        Fraction Tich = new Fraction();
        Tich.tu = ps1.tu * ps2.tu;
        Tich.mau = ps1.mau * ps2.mau;
        return Tich;
    }
    public  Fraction div(Fraction ps1, Fraction ps2) {
        Fraction Thuong = new Fraction();
        Thuong.tu = ps1.tu * ps2.mau;
        Thuong.mau = ps1.mau * ps2.tu;
        return Thuong;
    }
}
