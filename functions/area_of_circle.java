package functions;
import java.util.Scanner;

public class area_of_circle {

    public static double cal(double r){
      return r*r*3.14;
    }
    public  static void main(String[] jay){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        
        System.out.print("Area of Circle is : "+cal(r));
    }
}
