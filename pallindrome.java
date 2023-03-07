import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=num;
        int k=num;
        int count=0;
        int sum=0;
        int num1=0;
    /*    while(a!=0){
            a=a/10;//42
            count++;//1
        }
        System.out.println(count);
        int r=count+1;
        for(count=1 ;count<r;count++ ){
            int div=num/10;
            int rem=num%10;
            num=div;
            sum=0;
            sum+=Math.pow(10,r-count-1);
            num1+=(rem*sum);
        }
        if(k == num1) System.out.println("pallindrome");
        else System.out.println("not pallindrome");       */
        while(a>0){
            int rem=a%10;//32
            sum = sum*10+rem;//3
            a=a/10;//12
        }
        if (sum==num) System.out.println("pallindrome");

        else System.out.println("not pallindrome");


    }
}
