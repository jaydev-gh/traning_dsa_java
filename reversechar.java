public class reversechar {
    public static void main(String[] args){
        char ch='D';
        for(char i=ch;i>='A';i--){
            for(char j='A';j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
