package functions;

import java.util.Scanner;

public class prime_0_1 {

    public static boolean isPrime(int a){
        int c = 0;

        if(a<=1){
            return false;
        }
        for(int i=1;i<=a;i++){
            if(a%i==0){
                c++;
            }
        }
        if(c == 2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Given number is prime : "+isPrime(a));
    }
}
