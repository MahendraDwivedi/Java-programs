import java.util.Scanner;

public class maxminfunc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number :");
        double num1=sc.nextDouble();
        System.out.println("enter first number :");
        double num2=sc.nextDouble();
        System.out.println("enter first number :");
        double num3=sc.nextDouble();
        double max=maximum(num1,num2,num3);
        double min=minimum(num1,num2,num3);
        System.out.println("MAXIMUM OF THREE NUMBERS :" + max);
        System.out.println("MINIMUM OF THREE NUMBERS :" + min);
    }
    static double maximum(double a,double b,double c){
        double max=a;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        return max;
    }
    static double minimum(double a,double b,double c) {
        double min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
