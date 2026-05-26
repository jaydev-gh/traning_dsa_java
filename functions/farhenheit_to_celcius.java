package functions;

import java.util.Scanner;

public class farhenheit_to_celcius {
    
    public double f_to_c(int f){
        return (f-32)*0.5556;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            farhenheit_to_celcius obj = new farhenheit_to_celcius();
            System.out.print("Farhenheit of " +a+" is : "+obj.f_to_c(a));
            sc.close();
    }
}

