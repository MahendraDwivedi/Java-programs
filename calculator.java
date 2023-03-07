import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What you want to do , enter 1 , 2 ,3 OR 4 BELOW:");
        System.out.println("1)ADDITON     2)SUBSTRACTION      3)MULTIPLICATION     4) DIVISION : ");
        int op=sc.nextInt();
        int a=1;
        int b=0;
        if (op==1){
            System.out.println("HOW MANY NUMBERS YOU WANT TO ADD:");
            int in=sc.nextInt();
            while (a<=in){
                System.out.println("enter number " + a);
                int in1=sc.nextInt();
                b+=in1;
                a++;
            }
            System.out.println(b);

        }
        if (op==2){
            System.out.println("HOW MANY NUMBERS YOU WANT TO SUBTRACT:");
            int in=sc.nextInt();
            while (a<=in){
                System.out.println("enter number " + a);
                int in1=sc.nextInt();
                int m=in1;
                b=-b+m;

                a++;
            }
            System.out.println(b);
        }
        if (op==3){
            System.out.println("HOW MANY NUMBERS YOU WANT TO multiply:");
            int in=sc.nextInt();
            b=1;
            while (a<=in){
                System.out.println("enter number " + a);
                int in1=sc.nextInt();
                b*=in1;
                a++;
            }
            System.out.println(b);
        }
        if (op==4){
            System.out.println("HOW MANY NUMBERS YOU WANT TO DIVIDE:");
            int in=sc.nextInt();
            b=1;
            while (a<=in){
                System.out.println("enter number " + a);
                int in1=sc.nextInt();

                b=in1/b;
                a++;
            }
            System.out.println(b);

        }
    }
}
