import java.util.Scanner;

public class minmaxlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER HOW MANY NUMBERS YOU WANT TO COMPARE:");
        int in= sc.nextInt();
        int[] arr=new int[in];
        for (int i=0;i<in;i++){
            System.out.println("ENTER NUMBER "+i+":");
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int j=0;j<in;j++){
            if (arr[j]<min){
                min=arr[j];
            }
            if (arr[j]>max){
                max=arr[j];
            }

        }
        System.out.println("SMALLEST AND LARGEST VALUE OF ALL IN THE LIST ARE :" +min+","+max);
    }
}
