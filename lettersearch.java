public class lettersearch {
    public static void main(String[] args) {
        String name= "mahendra";
        char lt='h';
        System.out.println(search(name,lt));
    }
    static boolean search(String str ,char lt){
        if (str.length()==0) {
            return false;
        }
        for(int i=0;i< str.length();i++){
            if(str.charAt(i)==lt){
                return true;
            }
        }
        return false;
    }
}
