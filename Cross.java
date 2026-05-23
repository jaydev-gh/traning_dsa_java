public class Cross {
    public class circlepatterren {
    public static void main(String[] args) {
        int n = 10;
        int target = n/5;
        for(int i = 0;i<n;i++){
            for(int j =0 ;j<n;j++){
            if(i<=target && j<=target || i<=target && j>=n-3 ||i>=n-3 && j<=target || i>=n-3 && j>=n-3){
                System.out.print(" "+" ");

            }else{
                System.out.print("*"+" ");
            }
        }
        System.out.println();
    }
}
}
}
