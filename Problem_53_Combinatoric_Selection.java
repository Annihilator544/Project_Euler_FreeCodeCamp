import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
public class Problem_53_Combinatoric_Selection {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int count = 0;
        for(int n = 1; n <= 100; n++){
            for(int r = 1; r <= n; r++){
                if(nCr(n, r).length() > 6){
                    count++;
                }
            }
        }
        System.out.println(count);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static String nCr(int n, int r){
        
        BigDecimal nFact = new BigDecimal(1);
        for(int i=n-r+1;i<=n;i++){
            nFact = nFact.multiply(new BigDecimal(i));
        }
        BigDecimal rFact = new BigDecimal(1);
        for(int i=1;i<=r;i++){
            rFact = rFact.multiply(new BigDecimal(i));
        }
        BigDecimal nCr = nFact.divide(rFact);
        
        return nCr.toString();
    }
}
