package functions;

import java.util.Scanner;

public class strongnum {

    public static long fact(long a){
        long fact =1;
        for(long i =1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static boolean str(long n){
        long original =n;
        long strong =0;
        while(n>0){
            long temp = n%10;
            strong +=fact(temp);
            n=n/10;
        }
        return (original==strong)?true:false;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n = sc.nextLong();
       System.out.println(str(n));
    }
}
