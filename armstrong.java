import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=n;
        int d=s;
        int sum =0;
        int count =0;

        while(n>0){
            int temp =n%10;
            count++;
            n =n/10;

        }
        while(s>0){
            int temp =s%10;
            sum+=Math.pow(temp, count);
            s /=10;
        }

        if(d==sum){
            System.out.println("armstrong");
        }else{
              System.out.println("not armstrong");
        }

    }
}
