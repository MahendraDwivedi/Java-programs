import java.util.Scanner;

public class evenoddufn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. :");
        int num=sc.nextInt();
        /* String num1=check(num);*/
        if ( checkeven(num))
            System.out.println("EVEN NUMBER");
        else System.out.println("ODD NUMBER");
    }
    static boolean checkeven(int a){
        String b="even";
        if (a%2==0);
            return true;
    }

}
