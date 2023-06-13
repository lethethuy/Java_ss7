package baithuchanh1;

public class Main {
    public static void main(String[] args) {
        Student.change(); // goi method change

        // creating object
        Student s1 = new Student(111,"Nhung");
        Student s2 = new Student(222, " Thuy");
        Student s3 = new Student(333, "Binh");


        // calling display
        s1.display();
        s2.display();
        s3.display();
    }
}