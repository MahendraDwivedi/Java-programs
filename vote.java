import java.util.Scanner;

public class vote {
    static String age(int a){
        String b;
        if ( a>=18) b="e";
        else b="ne";
        return b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age :");
        int in=sc.nextInt();
        if (age(in)=="e") System.out.println("ELIGIBLE FOR VOTING");
        else System.out.println("NOT ELIGIBLE FOR VOTING");
    }
}
