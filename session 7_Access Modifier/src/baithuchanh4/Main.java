package baithuchanh4;

public class Main {
    public static void main(String[] args) {
        // Truy cập thuộc tính, phương thức không cần khơi tạo đối tượng

        System.out.println("Tên : "+ StaticMethod.name);
        System.out.println("Tuổi : "+ StaticMethod.age);

        StaticMethod.showInfo();

        // Khởi tạo đối tượng
        StaticMethod staticMethod = new StaticMethod();
        System.out.println("Ten : "+ staticMethod.name);
        System.out.println("Tuoi : "+ staticMethod.age);

        staticMethod.showInfo();
    }
}
