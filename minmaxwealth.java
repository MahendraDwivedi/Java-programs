import java.util.ArrayList;
import java.util.Scanner;

public class minmaxwealth {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter no.of person:");
        int per=in.nextInt();
        System.out.println("enter no.of acconts:");
        int acc=in.nextInt();
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        //initialisation
        for(int i=0;i<per;i++){
            list.add(new ArrayList<>());
            System.out.println(list);
        }
        //add elements
        System.out.println("enter no. :");
        for(int i=0;i<per;i++){
            for(int j=0;j<acc;j++){
                list.get(i).add(in.nextInt());

            }
        }
        System.out.println(list);
        System.out.println(list.get(1));

    }

}
