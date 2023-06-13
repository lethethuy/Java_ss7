package baitao3;

public class TestCircle {
    private double radius = 1;
    private String color = "red";

    public TestCircle() {
    }

    public TestCircle(double radius) {
        this.radius = radius;
    }

//    public double getArea() {
//        return 3.14*radius*radius;
//    }
    private double getArea() {
        return 3.14*radius*radius;
    }

    public double get2Area(){
        return getArea();
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }




}
