public class Problem_6_Sum_square_difference {
    static void sumSquareDifference(int i){
        int sum1=0,sum2=0;
        for(int k=1;k<=i;k++){
            sum1+=k*k;
        }
        for(int k=1;k<=i;k++){
            sum2+=k;
        }
        sum2*=sum2;
        System.out.println(sum2-sum1);
    }
    public static void main(String [] args){
        sumSquareDifference(10);
        sumSquareDifference(20);
        sumSquareDifference(100);
    }
}
