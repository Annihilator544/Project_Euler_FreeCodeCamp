public class Problem_21_Amicable_Numbers {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int sum3=0;
        for(int i = 1; i < 10000; i++){
            sum3+=amicable(i);
        }
        System.out.println(sum3);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }

    static int amicable(int i){
        int sum = 0;
        for(int j = 1; j <= i/2; j++){
            if(i % j == 0){
                sum += j;
            }
        }
        if(sum != i){
            int sum2 = 0;
            for(int j = 1; j <= sum/2; j++){
                if(sum % j == 0){
                    sum2 += j;
                }
            }
            if(sum2 == i){
                return i;
            }
            else{
                return 0;
            }
        }
        else{
            return 0;
        }
    }
}
