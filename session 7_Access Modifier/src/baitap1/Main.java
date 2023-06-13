package baitap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // khoi tao mot bien luu tru
        Scanner scanner = new Scanner(System.in);

       // Khoi tao Object
        MyClass myClass = new MyClass();
        System.out.println("Hay nhap van ban thay the");
        String word = scanner.nextLine();

        //setMystring
        myClass.setMyString(word);

        //Hien thi
        myClass.disPlay();


    }
}
