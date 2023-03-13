import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        //syntax
        /*ArrayList<Integer> list=new ArrayList<>(5);
        list.add(110);
        list.add(10);
        list.add(13);
        list.add(180);
        list.add(16);
        list.add(180);
        list.add(155);
        list.add(15);
        list.add(185);
        list.add(162);
        list.add(11);
        list.add(10);
        System.out.println(list);
        System.out.println(list.contains(180));
        System.out.println(list.contains(188));
        list.remove(2);
        list.set(5,105050);
        System.out.println(list);*/
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        //initialisation
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
            System.out.println(list);
        }
        //add elements
        System.out.println("enter no. :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());

            }
        }
        System.out.println(list);

    }
}

