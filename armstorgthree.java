import java.util.Scanner;

public class armstorgthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any 3 didgit number to be checked:");
        int n=sc.nextInt();//321
        int x,y,z,l,m;
        for (x=2;x<3;x++){
            y=n/100;//1
            z=n%100;//53
            l=z/10;//5
            m=z%10;//3
            if(n==y*y*y+m*m*m+l*l*l){
                System.out.println("armstrong");
            }
            else{
                System.out.println("not armstorg");
            }
        }

    }
}
