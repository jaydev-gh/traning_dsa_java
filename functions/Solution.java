package functions;

public class Solution {
   static int convertfive(int num) {
        // Your code here
        int sum =0;
        if(num ==0){
            return 5;
        }else{
        while(num>0){
            int temp = num%10;
            if(temp == 0){
                sum =sum*10+5;
            }else{
                sum = sum*10+temp;
            }
            num =num/10;
        }
        int rev=0;
         while(sum>0){
            int temp = sum%10;
                rev = rev*10+temp;
            sum =sum/10;
        }
        return rev;
    }
}
public static void main(String[] args) {
    int num = 1020;
    System.out.println(convertfive(num));
}}