import java.util.*;
import java.math.*;
public class Problem_23_Non_Abundant_Sums {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int sum2 = 0;
        ArrayList<Integer> abundant = new ArrayList<Integer>();
        for(int i = 1; i < 28123; i++){
            if(isAbundantSum(i)){
                abundant.add(i);
            }
        }
        System.out.println(abundant.size());
        for(int i = 1; i < 28123; i++){
            int flag=0;
            for(int j = 0; j < abundant.size(); j++){
               if(abundant.contains(i-abundant.get(j))){
                   flag=1;
                   break;
               }
            }
            
            if(flag==0){
                sum2+=i;
            }}
        System.out.println(sum2);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isAbundantSum(int i){
        int sum=0;
        for(int j = 1; j <= i/2; j++){
            if(i%j==0){
                sum+=j;
            }
        }
        if(sum>i){
            return true;
        }
        else{
            return false;
        }
        
    }
}
