public class Problem_14_Longest_Collatz_sequence {
    static int function (int j, int count){
        
        if(j==1){
            return count;
        }
        else if (j%2==0){
            j=j/2;
            count ++;
            return function(j,count);
        }
        else{
            j=3*j+1;
            count ++;
            return function(j,count);
        }
    }
    static int longestCollatzSequence(int k){
        int max=0;
        int num=0;
        for(int i=1;i<=k;i++){
            if(max<function(i,0)){
                max=function(i, 0);
                num=i;
            }
        } 
        return num;
    }
    public static void main(String[]args){
       System.out.println( longestCollatzSequence(14));
       System.out.println( longestCollatzSequence(5847));
       System.out.println( longestCollatzSequence(46500));
       System.out.println( longestCollatzSequence(54512));
       System.out.println( longestCollatzSequence(100000));
       System.out.println( longestCollatzSequence(100000));
    }
}
