public class ncr {
    public static void main(String[] args) {

       int n=5;
         int r=2;
        int a=0;
        // code here
        if(r>n){
System.out.println(0);
        }else{
            if(r==0){
                System.out.println(1);
            }else{
            int n_fact=1;
            int d_fact=1;
            int n_rfact=1;
            for(int i=1;i<=n;i++){
                if(i<=n){
                n_fact*=i;
                }
                if(i<=r){
                   d_fact *=i;
                }
                if(i<=(n-r)){
                   n_rfact*=i;
                }
            }
            
            a =  n_fact / (d_fact *n_rfact);
        }}
       System.out.println(a);
    }
}   
    
 
        

