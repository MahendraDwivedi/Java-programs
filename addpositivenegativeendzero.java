import java.util.Scanner;

public class addpositivenegativeendzero {
    public static void main(String[] args) {
        System.out.println("enter any number to start and add even among them and 0to end:");
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int num=sc.nextInt();
            while(true){
                if (num>0){
                    System.out.println("enter numbers:");
                    int num1=sc.nextInt();
                    if (num1==0){
                        break;
                    }
                    else if(num1%2==0) sum+=num1;
                }
                else if (num<0){
                    System.out.println("enter numbers:");
                    int num1=sc.nextInt();
                    if (num1==0){
                        break;
                    }
                    else if(num1%2==0)
                    sum+=num1;
                }
                else
                    break;
            }
        System.out.println(sum);

    }
}
