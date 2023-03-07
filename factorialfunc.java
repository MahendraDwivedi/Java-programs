import java.util.Scanner;

public class factorialfunc {
    static int fact(int a){
        int num,b=1;
        for(num=1;num<=a;num++){
            b*=num;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :");
        int in=sc.nextInt();
        System.out.println("FACTORIAL OF " + in + "is" + fact(in));
    }
}
