package functions;

import java.util.Scanner;

public class bin_to_deci {
    public static long deci(long n){

             long rev = 0;
             long pow = 1;
        while(n>0){
          long temp = n%10;
          rev =rev+temp*pow;
                    pow = pow*2; 
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
