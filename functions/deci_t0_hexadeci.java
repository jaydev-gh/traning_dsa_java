package functions;


public class deci_t0_hexadeci {
    public static String hexa(long n){
        if(n==0) return "0";
        StringBuilder sb =new StringBuilder();
        while(n>0){
            int rem = (int)n%16;
            if(rem<10) sb.append((char)('0'+rem));
            else sb.append((char)('A'+(rem-10)));
            n =n/16;
        }
        
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        long n =13245;
        System.out.println(hexa(n));
    }
    
}
