import java.util.Scanner;

public class isprimefor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int b=0;
        if (n==1 || n==0){
            System.out.println("prime");

        }
        for (i=2 ;i<n;i++){
            if(n%i==0){
                b=1;
                break;
            }
        }
        if (b == 1) {
            System.out.println("not prime");
        }
        else {
            System.out.println("prime");
        }
    }
}
