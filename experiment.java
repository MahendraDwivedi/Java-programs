import java.util.Scanner;

public class experiment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many digits number you want to enter:");
        int n=sc.nextInt();//3
        System.out.println("enter your number:");//123
        int m=sc.nextInt();
        int l=10;
        int k;
        double x,y,z=0;
        for(k=1;k<=n;k++){
            x=Math.pow(l,n-k);//100
            System.out.println(x);
            y=m/x;//1//
            System.out.println(y);
            z+=Math.pow(y,n);
            System.out.println(z);
            y=y-x;
            System.out.println(y);
        }
        System.out.println(z);
    }
}
