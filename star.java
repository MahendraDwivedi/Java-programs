import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS :");
        int a=sc.nextInt();
        int b=1;
        for(int i=1;i<=a;i++){
            int c=i;
            while(b<=c){
                System.out.print("*");
                c--;
            }
            System.out.println();
        }
    }
}
