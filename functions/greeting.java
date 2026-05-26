package functions;
import java.util.Scanner;

public class greeting {

    public static void name(String n){
         System.out.println("Hello "+ n);
    }
    public static void main(String[] jay){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        name(n);
    }
}
