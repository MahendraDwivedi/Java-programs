import java.util.Scanner;

public class producttwofunc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number :");
        int in =sc.nextInt();
        System.out.println("enter second number :");
        int in2=sc.nextInt();
        int mul=multiply(in,in2);
        System.out.println(mul);
    }
    static int multiply(int a,int b){
        int mul=a*b;
        return mul ;
    }
}
