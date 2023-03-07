import java.util.Scanner;

public class reversestar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NO. :");
        int in= sc.nextInt();
        int a=in;
        while(a>0){
            int b=a;
            while(b!=0){
                System.out.print("*");
                b=b-1;
            }
            System.out.println();
            a--;

        }

    }
}
