

public class MyThoughCirclePattern {
    public static void main(String[] args) {

        int n = 11;
        int cut = n / 4;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                if(
                   (i + j < cut) ||                      
                   (j - i >= n - cut) ||                  
                   (i - j >= n - cut) ||                 
                   (i + j >= (2*n - cut - 1))             
                  )
                {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
