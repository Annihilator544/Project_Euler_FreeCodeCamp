import java.util.ArrayList;
public class Problem_3_Largest_prime_factor {
   static ArrayList<Integer> Prime=new ArrayList<Integer>();
    static void largestPrimeFactor(int i){
        int max=0;
        for(int j=2;j<=i;j++){
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
        for(int g:Prime){
            if(i%g==0){
                if(g>=max){
                    max=g;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        largestPrimeFactor(2);
        largestPrimeFactor(5);
        largestPrimeFactor(7);
        largestPrimeFactor(8);

    }
}
