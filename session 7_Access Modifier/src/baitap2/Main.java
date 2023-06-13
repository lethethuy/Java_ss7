package baitap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khoi tao bien luu tru gia tri
        Scanner sc = new Scanner(System.in);
        // Khoi tao doi tuong
        StaticMethod staticMethod = new StaticMethod();

        // Tinh dien tich tam giac
        System.out.println("Hay nhap ban kinh hinh tron 1: ");
        double r1 = sc.nextDouble();
        System.out.println("Hay nhap ban kinh hinh tron 2: ");
        double r2 = sc.nextDouble();
        System.out.println("Hay nhap ban kinh hinh tron 3: ");
        double r3 = sc.nextDouble();
        staticMethod.dienTichHinhTron(r1,r2,r3);

        // Tinh dien tich hinh chu nhat

        System.out.println("Hay nhap chieu rong hcn 1: ");
        double a1 = sc.nextDouble();
        System.out.println("Hay nhap chieu cao hcn 1: ");
        double b1 = sc.nextDouble();
        System.out.println("Hay nhap chieu rong hcn 2: ");
        double a2 = sc.nextDouble();
        System.out.println("Hay nhap chieu cao hcn 2: ");
        double b2 = sc.nextDouble();
        System.out.println("Hay nhap chieu rong hcn 3: ");
        double a3 = sc.nextDouble();
        System.out.println("Hay nhap chieu cao hcn 3: ");
        double b3 = sc.nextDouble();

        staticMethod.dienTichHinhChuNhat(a1,b1,a2,b2,a3,b3);

    }
}
