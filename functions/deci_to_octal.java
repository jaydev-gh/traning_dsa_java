package functions;
public class deci_to_octal {
    public static long oct(int n){
       long rev =0;
       int pow =1;
       while(n>0){
        int rem = n%8;
        rev+=rem*pow;
        pow =pow*10;
        n=n/8;
       }
       return rev;
    }
    public static void main(String[] jay){
        int m=123;
        System.out.print(oct(m));
    }
}