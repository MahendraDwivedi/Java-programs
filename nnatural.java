import java.util.Scanner;

public class nnatural {
    static int sum(int n) {
        int sum=0 ;
        for(int a=1;a<=n;a++){
            sum+=a;
        }return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER n:");
        int n=sc.nextInt();
        System.out.println(sum(n) + " is the sum of first " + n+" natural numbers");
    }
}

