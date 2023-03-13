import java.util.Scanner;

public class diamondstar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTRE THE NUMBER:");
        int in1= sc.nextInt();
        int in,m;
        if (in1%2==0){ in=in1/2;m=in;}
        else {in=in1/2 +1;m=in-1;}
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
        while(m!=0){
            int d=in-m;
            while(d!=0){
                System.out.print(" ");
                d--;
            }
            int c=m*2-1;
            while(c>0){
                System.out.print("*");
                c--;
            }
            System.out.println();
            m--;
        }
    }
}
