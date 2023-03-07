import java.util.Scanner;

public class sumfunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number :");
        int in =sc.nextInt();
        System.out.println("enter second number :");
        int in2=sc.nextInt();
        int sum=add(in,in2);
        System.out.println(sum);
    }
    static int add(int a,int b){
        int sum=a+b;
        return sum ;
    }
}
