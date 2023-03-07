import java.util.Scanner;

public class primebyfunc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int a= sc.nextInt();
        if (prime(a)){
            System.out.println(a +"is prime  number");
        }
        else System.out.println(a + "is prime not number");

    }
    static boolean prime(int a){
        int num=a;
        if (num<=1){
            return false;
        }
        for(num=2;num<=a/2; num++) {
            if (a % num == 0) {
                return false;
            }
        }
       return true;
    }
}
