package functions;

import java.util.Scanner;

public class bin_to_oct {
    public static long otd(long n){
        long pow  = 1;
        long rev = 0;

        while (n > 0) {
            long temp = n % 10;
            rev = rev + temp * pow;
            pow = pow * 2;
            n = n / 10;
        }
        return rev;
    }
    public static long deci_to_binary(long n) {
        long a = otd(n);
        if (a == 0) return 0;
        long rev = 0;
        long pow = 1;
        while (a > 0) {
            int rem = (int) (a % 8);
            rev += rem * pow;
            pow = pow * 10;
            a = a / 8;
        }
        return rev;
    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(deci_to_binary(n));
    }
}
