import java.util.Scanner;

public class reversetriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of lines:");
        int in =sc.nextInt();
        int n=in;
        while(n>0){
            int a=in-n;
            while(a!=0){
                System.out.print(" ");
                a--;
            }
            int b=n*2-1;
            while(b>0){
                System.out.print("*");
                b--;
            }
            System.out.println();
            n--;
        }
    }
}
