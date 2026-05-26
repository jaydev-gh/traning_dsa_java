// package functions;
// import java.util.*;
// public class ncr {
//     public static long fact(int n){
//         long fact =1;
//         for(int i=1;i<=n;i++){
//             fact*=i;
//         }
//         return fact;
//     }

//     public static void main(String[] jay){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();
        
//         System.out.println(fact(n)/(fact(r)*fact(n-r)));

//     }
// }

class Solution {
    static long factorial(int num, int r) {
        long fact = 1;
        if (r > num - r) {
            r = num - r;
        }
        for (int i = 1; i <= r; i++) {
            fact = fact * (num - r + i) / i;
        }
        return fact;
    }

    public int nCr(int n, int r) {
        if (r > n) {
            return 0;
        }
        long nCr = factorial(n, r);
        return (int)nCr;
    }
}