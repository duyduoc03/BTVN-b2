package sesstion2.Fraction;

import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Fraction ps1 = new Fraction();
        Fraction ps2 = new Fraction();
        Fraction Tong = new Fraction();
        Fraction Hieu = new Fraction();
        Fraction Tich = new Fraction();
        Fraction Thuong = new Fraction();
        //
        System.out.println("\t\tNhập vào 2 phân số\n");
        ps1.nhap();
        ps2.nhap();
        ps1.in();
        ps2.in();
        System.out.println("Phân số 1:");
        ps1.RutGon();
        ps1.Dao();
        System.out.println("Phân số 2:");
        ps2.RutGon();
        ps2.Dao();
        Tong = Tong.add(ps1,ps2);
        System.out.println("\n\n\nTổng của " + ps1.tu + "/" + ps1.mau + " + " + ps2.tu + "/" + ps2.mau + " = ");
        Tong.RutGon();
        Hieu = Hieu.sub(ps1,ps2);
        System.out.println("Hiệu của " + ps1.tu + "/" + ps1.mau + " - " + ps2.tu + "/" + ps2.mau + " = ");
        Hieu.RutGon();
        Tich = Tich.mul(ps1,ps2);
        System.out.println("Tích của " + ps1.tu + "/" + ps1.mau + " x " + ps2.tu + "/" + ps2.mau + " = ");
        Tich.RutGon();
        Thuong = Thuong.div(ps1,ps2);
        System.out.println("Thương của " + ps1.tu + "/" + ps1.mau + " : " + ps2.tu + "/" + ps2.mau + " = ");
        Thuong.RutGon();
    }
}
