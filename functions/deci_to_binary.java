package functions;

public class deci_to_binary {
    public static int bi(int n){
        int rev =0;
        int pow =1;
        while(n>0){
            int rem = n%2;
            rev+=rem*pow;
            pow*=10;
            n/=2;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(bi(n));
    }
}
