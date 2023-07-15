import java.math.BigInteger;
public class Problem_48_Self_Powers {
    public static void main(String[] args){
        BigInteger sum = BigInteger.ZERO;
        for(int i = 1; i <= 1000; i++){
            sum = sum.add(BigInteger.valueOf(i).pow(i));
        }
        System.out.println(sum.toString());
    }
}
