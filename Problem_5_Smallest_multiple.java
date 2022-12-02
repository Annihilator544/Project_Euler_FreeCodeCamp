public class Problem_5_Smallest_multiple {
   static void smallestmult(int i){
    int var=1;
    int count=0;
       while(count!=i){
         count=1;
        var++;
        for(int k=2;k<=i;k++){
            if(var%k==0){
                count++;
            }
        }
        if(count==i){
            System.out.println(var);
        }
       }
    }
    public static void main(String[] args){
        smallestmult(5);
        smallestmult(7);
        smallestmult(10);
        smallestmult(13);
        smallestmult(20);
        smallestmult(20);
    }
}
