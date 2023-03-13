import java.util.Scanner;

public class equitrianglestar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int in= sc.nextInt();
        int n=in;
        while(n!=0){
            for(int a=1;a<n;a++){
                System.out.print(" ");
            }
            int b=(in-n)*2+1;
            for(int c=1;c<=b;c++){
                System.out.print("*");
            }
            System.out.println();
            n--;

        }
    }
}
