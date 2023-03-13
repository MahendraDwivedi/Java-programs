public class linearsearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int num=0;//to check that if the number if in the array or not
        System.out.println(search(arr,num));
    }
    static int search(int[]arr,int num){
        if (arr.length==0)
            return -1;//return -1 if the number isn't inthe array
        for (int i=0;i<arr.length;i++){
            if (num==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
