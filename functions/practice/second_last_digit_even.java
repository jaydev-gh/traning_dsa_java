package functions.practice;

public class second_last_digit_even {
    public static void main(String[] args) {
         int n =123852;
         int m=n%100;
         int k =m/10;
         if(k%2==0){
             System.out.println("Yes");
            }else{
            System.out.println("No");
            
         }
    }
}
