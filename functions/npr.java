package functions;

public class npr {
    class Solution {
         public static long fact(long n){
            long fact=1;
            for(long i=1;i<=n;i++){
                fact*=i;
                }
                return fact;
         }
    static long nPr(long n, long r) {
        // code here
            return (fact(n)/fact(n-r));
        }
        public static void main(String[] args) {
            long n = 5;
            long r = 2;
            System.out.println(nPr(n,r));
        }
    }
}
