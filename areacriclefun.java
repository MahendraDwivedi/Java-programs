import java.util.Scanner;

public class areacriclefun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius :");
        double r=sc.nextDouble();
        double ar=area(r);
        double c=cir(r);
        System.out.println("AREA OF THE CIRCLE IS :" + ar);
        System.out.println("CIRCUMFERENCE OF THE CIRCLE ID :" + c);
    }
    static double area(double r){
        double ar=(3.14)*r*r;
        return ar;
    }
    static double cir(double r){
        double cir=(6.28)*r;
        return cir;
    }
}
