import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int num=sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        int sum,a;
        int b=0;
        int x=1;
        for(a=1;a<num-1;a++){
            sum=b+x;
            System.out.println(sum);
            b=x;
            x=sum;
        }
    }
}
