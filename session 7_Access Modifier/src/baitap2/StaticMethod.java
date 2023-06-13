package baitap2;

public class StaticMethod {
    // Tạo thuộc tính Property
    double PI = 3.14;
  // Tao phuong tinh dien tich hinh tron
    public void dienTichHinhTron(double r1, double r2,double r3){
        System.out.println("Dien tich hinh tron r1 la: "+ PI*r1*r1);
        System.out.println("Dien tich hinh tron r1 la: "+ PI*r2*r2);
        System.out.println("Dien tich hinh tron r1 la: "+ PI*r3*r3);
    }

    public static void dienTichHinhTamGiac(double a,double b, double c){
        double nuaChuVi = (a+b+c)/2;
        System.out.println("Dien tich hinh tam giac: " + Math.sqrt(nuaChuVi*(nuaChuVi-a)*(nuaChuVi-b)*(nuaChuVi-c)) );
    }

    public void dienTichHinhChuNhat(double a1, double b1, double a2, double b2, double a3, double b3){
        System.out.println("Dien tich hinh chu nhat 1: "+ a1*b1);
        System.out.println("Dien tich hinh chu nhat 2: "+ a2*b2);
        System.out.println("Dien tich hinh chu nhat 3: "+ a3*b3);

    }


}
