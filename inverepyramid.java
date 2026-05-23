import java.util.Scanner;
public class inverepyramid {

    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    int n = 5;

    for(int i=n;i>=1;i--){
        for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
System.out.println();
    }
    sc.close();
    }
    

}
