package functions;

import java.util.Scanner;

public class octal_to_deci {
    public static long deci(long n){
        long pow  = 1;
        long rev =0;

        while (n>0) {
            int temp = (int)n%10;
            rev = rev+temp*pow;
            pow =pow*8;
            n =n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(deci(n));
    }
}
