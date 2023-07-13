import java.math.BigInteger;
public class Problem_20_Factorial_Digit_Sum {
    static void sum(int n){
        BigInteger fact=BigInteger.ONE;
        for(int i=1;i<=n;i++){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        String s=fact.toString();
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        sum(100);
    }
}
