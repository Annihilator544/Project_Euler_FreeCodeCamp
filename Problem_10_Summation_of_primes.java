import java.util.*;
public class Problem_10_Summation_of_primes {
    
    static void primeSummation(int i){
        ArrayList<Integer> Prime=new ArrayList<Integer>();
    for(int j=2;j<i;j++){
        int flag=0;
        for(int k=2;k<=j/2;k++){
            if(j%k==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            Prime.add(j);
        }
    }
    int sum=0;
    if(sum!=0){
        sum=0;
    }
    for(int k:Prime){
        sum+=k;
    }
    System.out.println(sum);
}
public static void main(String[] args){
    primeSummation(17);
    primeSummation(2001);
    primeSummation(140759);
    primeSummation(2000000);
}
}
