package functions;

import java.util.Scanner;

public class deci_to_any {
    public static String any(long n,long m){
        if(n ==0)  return "0";
        StringBuilder sb =new StringBuilder();
        while (n>0) {    
            int rem = (int)(n%m);
            if(rem<10) sb.append((char)('0' +rem));
            else sb.append((char) ('A'+(rem-10)));
            n =n/m;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        System.out.println(any(n, m));
    }
}
