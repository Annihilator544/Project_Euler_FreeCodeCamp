import java.math.*;
public class Problem_25_1000_digit_Fiibonacci_Number {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int count = 2;
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(0);
        while(c.toString().length() < 1000){
            c = a.add(b);
            a = b;
            b = c;
            count++;
        }
        System.out.println(count);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
}
