import java.util.Scanner;

public class freedays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String mon=sc.next();
        switch (mon) {
            case "january" -> System.out.println(15);
            case "february" -> System.out.println(14);
            case "march" -> System.out.println(15);
            case "april" -> System.out.println(15);
            case "may" -> System.out.println(15);
            case "june" -> System.out.println(15);
            case "july" -> System.out.println(15);
            case "august" -> System.out.println(15);
            case "september" -> System.out.println(15);
            case "october" -> System.out.println(15);
            case "november" -> System.out.println(15);
            case "december" -> System.out.println(15);
        }
    }
}
