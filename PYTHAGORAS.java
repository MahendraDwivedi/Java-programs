import java.util.Scanner;

public class PYTHAGORAS {
    static String pytha(int a,int b,int c){
        String val="";
        if (a*a==b*b*+c*c || b*b==a*a+c*c || c*c==a*a + b*b) val="PYTHAGORAS TRIPLET";
        else val="NOT PYTHAGORAS TRPLET ";
        return val;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THREE NUMBERS :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        String num=pytha(x,y,z);
        System.out.println(x+","+y+","+ z+ " ARE "+num);
    }
}
