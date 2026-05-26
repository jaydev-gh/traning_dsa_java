package functions;

import java.util.Scanner;

public class fibonacci {
    public static void fib(int n){
        int a=0;
        int b=1;
        int sum =1;

        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            sum =a+b;
            int tem =sum;
            a= b;
            b=tem;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);

    }
}
