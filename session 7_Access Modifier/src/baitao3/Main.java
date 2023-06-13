package baitao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // gọi 1 biến để lưu trữ
        Scanner sc = new Scanner(System.in);

        // khoi tao doi tuong
        TestCircle testCircle = new TestCircle();

        //
        System.out.println("Dien tich hinh tron la: "+ testCircle.get2Area());


    }
}
