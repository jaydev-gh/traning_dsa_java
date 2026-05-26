package functions;

import java.util.Scanner;

public class frequency_of_digit {
    public static int freq(String n,char digit){
        int c =0;
       for(int i=0;i<n.length();i++){
        if(n.charAt(i) ==digit){
            c++;
        }
       }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n =sc.nextLine();
        char digit =sc.nextLine().charAt(0);
        System.out.print(freq(n,digit));
    }
}
