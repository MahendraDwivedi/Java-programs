import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();//1234
        int sum=0;
        while (num>0){
            int rem=num%10;//4
            sum+=rem;
            int div=num/10;//123
            num=div;

        }
        System.out.println(sum);
    }
}
