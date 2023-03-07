import java.util.Scanner;

public class grade {
    static String check(int a){
        String b= "";
        if (a>91 && a<100) b="AA";
        if (a>81 && a<90) b="AB";
        if (a>71 && a<80) b="BB";
        if (a>61 && a<70) b="BC";
        if (a>51 && a<60) b="CD";
        if (a>41 && a<50) b="DD";
        if (a<=40) b="FAIL";
        return b;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS OUT OF 100 :");
        int in=sc.nextInt();
        System.out.println(check(in));
    }
}
