import java.util.Scanner;

public class middlestar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :");
        int in =sc.nextInt();
        int n=in;
        int b=in;
        while(n!=0){
            int a=1;
            for(a=1;a<n;a++) {
                System.out.print(" ");
            }
            for(int c=1;c<=n;c++){
                System.out.print("*");
            }
            n--;
            System.out.println();
        }


    }
}
