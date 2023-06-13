package baithuchanh3;

public class Main {
    public static void main(String[] args) {
        // tạo các đôi tượng từ lớp person

        Person p1 = new Person("Le", "The Thuy", 27, true);
        Person p2 = new Person("Nguyen", "Thi Hong Nhung", 27, false);

        // truy cap truc tiep cac thuoc tinh cua doi tuong
//        System.out.println(p1.firstName); // khong the truy cap truc tiep thuoc tinh private

        // truy cap gian tiep qua phuong thuc getter/setter
        System.out.println(p1.getFirstName());// "John
        System.out.println("Name p1: "+ p1.getFirstName()+ " "+ p1.getLastName());

    }
}
