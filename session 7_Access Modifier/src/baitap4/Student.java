package baitap4;

public class Student {
    private static String name = "John";
    private static String classes = "CO2";

    // tao ham constructor ko co tham so
    public Student(){
    }
    public  Student(String name, String classes){
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void disPlay(String name, String classes){
        System.out.println("Thong tin sinh vien " + "\n" + "ten " + name +"\n" + "lop " + classes );
    }
}
