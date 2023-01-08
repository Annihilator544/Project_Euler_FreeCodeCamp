import java.math.*;
import java.util.*;
public class Problem_16_Power_digit_sum {
    static void powerDigitSum(int i){
        double num= Math.pow(2, i);
        int sum=0;
        while (num!=0){
            sum+=((int)num%10);
            num/=10;
            Math.floor(num);
        }
        System.out.println(sum);

    }
    public static void main(String[] args){
        powerDigitSum(15);
        powerDigitSum(128);
        powerDigitSum(1000);
    }
}
