import java.util.Scanner;

public class pandcbyfunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();
        System.out.println("enter r:");
        int r=sc.nextInt();
        int x=prime(n);
        int y=prime(r);
        int z=prime(n-r);
        System.out.println("permutation =" + x/z);
        System.out.println("combiantin =" + x/(y*z));
    }
    static int prime(int l) {
        int sum=1;
        int fac;
        for (fac=1;fac<=l;fac++){
            sum*=fac;
        }
        return sum;
    }
}