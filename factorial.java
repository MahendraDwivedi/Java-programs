import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int in=sc.nextInt();
        int fac=1;
        int a;
        while (in!=0){
            fac=fac*in;
            in--;
        }
        System.out.println(fac);
    }
}
