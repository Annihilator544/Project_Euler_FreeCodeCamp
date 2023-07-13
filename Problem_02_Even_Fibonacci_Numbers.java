import java.util.*;
public class Problem_02_Even_Fibonacci_Numbers {
    static int fib(int i){
        if(i==0||i==1)
            return i;
        else
            return(fib(i-1)+fib(i-2));

    }
    static void fiboevensum(int i){
        ArrayList <Integer> L=new ArrayList<Integer>();
        for (int j=0;j<=i;j++){
        
            if(fib(j)%2==0){
                L.add(fib(j));
            }
        
        if(fib(j)>=i){
            break;
        }
        }
    int sum=0;
    for(int k:L)
        sum+=k;
    System.out.println(sum);
    }
    
    public static void main(String[] args){
        fiboevensum(8);
        fiboevensum(10);
        fiboevensum(34);
        fiboevensum(60);
        fiboevensum(1000);
        fiboevensum(100000);
        fiboevensum(4000000);
    }
}
