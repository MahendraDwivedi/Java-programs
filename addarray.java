import java.util.Scanner;

public class addarray {
    public static void main(String[] args) {
        System.out.println("enter size of the arrays:");
        Scanner sc=new Scanner(System.in);
        int sz=sc.nextInt();
        int[] arr=new int[sz];
        int[] arr1=new int[sz];
        int[] arr2=new int[sz];
        for(int i=0;i<sz;i++){
            System.out.println("enter element no. of first array:");
            int b=sc.nextInt();
            arr[i]=b;
            System.out.println("enter element no. of second array:");
            int c=sc.nextInt();
            arr1[i]=c;
            arr2[i]=arr[i]+arr1[i];
        }
        for(int i=1;i<sz+1;i++){
            System.out.println(i+" Element "+arr2[i-1]);
        }
    }
}
