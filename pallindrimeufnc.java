import java.util.Scanner;

public class pallindrimeufnc {
    static int pallindrome(int a){
        int sum=0;
        while(a>0){
            int rem=a%10;//32
            sum = sum*10+rem;//3
            a=a/10;//12
        }return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :");
        int in=sc.nextInt();
        if (pallindrome(in)==in) System.out.println("pallindrome");

        else System.out.println("not pallindrome");

    }
}
