import java.util.Scanner;

public class stringrevese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b="";
        int n=a.length();
        while(n>0) {
            b = b + String.valueOf(a.charAt(n - 1));
            n = n - 1;
        }
        System.out.println(b);

    }
}
