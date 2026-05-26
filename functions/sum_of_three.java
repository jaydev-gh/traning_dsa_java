package functions;

import java.util.Scanner;

public class sum_of_three {

    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] jay){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       
        int res =sum(a,b,c);
        System.out.println(res);
        
    }

}
