// import java.util.Scanner;

// public class fibonacci {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int  n = sc.nextInt();
//          int sum;
//          int a =0;
//          int b =1;
//         for(int i =0;i<n;i++){
           
//            System.out.print(a+" ");
//            sum = a+b;
//            a =b;
//            b = sum;

//         }
//         sc.close();
//     }
// }

import java.util.Scanner;

public class fibonacci {

    public static int fib(int a) {
        if (a <= 1) {
            return a;
        }
        return fib(a - 1) + fib(a - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        sc.close();
    }
}