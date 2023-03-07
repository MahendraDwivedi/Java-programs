import java.util.Scanner;

public class evenoddfunc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER NUMBER :");
        int num=sc.nextInt();
       /* String num1=check(num);*/
        if ( checkeven(num)=="even")
            System.out.println("EVEN NUMBER");
        else System.out.println("ODD NUMBER");
    }
    static String checkeven(int a){
        String b;
        if (a%2==0){
            b="even";
        }
        else
            b="odd";
        return b;
    }

}
