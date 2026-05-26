package functions;

import java.util.Scanner;

public class is_vowel {

    public static boolean isVowel(char a){
        if(a == 'A'||a =='E' || a=='I' ||a=='O' || a=='U' || a=='a' || a =='e' || a=='i' || a=='o' || a=='u'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0); 
        
        System.out.print(isVowel(ch) == true?"Given character is a Vowel":"Given character is Not a Vowel");

    }
}
