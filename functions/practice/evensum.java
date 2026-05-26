package functions.practice;
import java.util.Scanner;

public class evensum {
    public static int even(int n){
        if(n%2==0){
            return n;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum+=even(i);
        }
        System.out.println(sum);
    }
}