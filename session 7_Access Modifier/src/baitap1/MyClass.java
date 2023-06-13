package baitap1;

public class MyClass {
    // Tạo thuộc tính (object) của MyClass
    private String myString;


    // Khoi tao contructor khong co tham so
    public MyClass(){

    }
    public MyClass(String myStr){
     this.myString = myStr;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }
    public void disPlay(){
        System.out.println(
                "Van Ban: "+ myString
        );
    }
}
