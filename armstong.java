import java.util.Scanner;

public class armstong {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();//425
        int count=0;
        int a=num;
        int k=0;
        while(a!=0){
            a=a/10;//42
            count++;//1
        }
        System.out.println(count);
        int sum=0;
        int temp=num;
        while(num>0){
            k=num%10;
            sum+=Math.pow(k,count);
            num=num/10;
        }
        if (temp==sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstron");
        }
    }
}
