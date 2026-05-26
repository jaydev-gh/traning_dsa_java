package games;

import java.util.Random;
import java.util.Scanner;

public class numgussing {

    public static void playgame(int ran){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        if(n ==ran ){
            System.out.println("You Guessed correct digit : "+n);
            
        }else if(n>ran){
             System.out.println("You Guessed Larger digit please guessed small digit : ");
             playgame(ran);
        }else {
            System.out.println("You Guessed Smaller digit please guessed Larger digit : ");
             playgame(ran);
        }
    }
    public static void main(String[] args) {
     int ran = 1+(int)(100*Math.random());
     playgame(ran);
     
    }
}
