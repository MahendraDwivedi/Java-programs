import java.util.Scanner;

public class permutationandcombination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        System.out.println("enter r:");
        int n=sc.nextInt();
        int r= sc.nextInt();
        int c=1;
        int b=1;
        int a=1;
        int rem=1;
        int l=1;
        while(a<=n){
            b*=a; // b= nact
            a++;
        }
        while (c<=n-r){
            rem*=c;//n-r fact
            l*=(c+1);//l r fact
            c++;
        }

        System.out.println("permutation of given no. is "+ "  " + b/rem);
        System.out.println("combination of given no.is  :"+"   "+ b/(rem*l));


    }
}
