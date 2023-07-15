public class Problem_32_Pandigital_Products {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int sum = 0;
        for(int i = 1; i < 10000; i++){
            for(int j = 1; j < 10000; j++){
                if(isPandigital(i, j)){
                    if(!isInSum(i, j, sum)){
                        sum+=i*j;
                    }
                }
            }
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isPandigital(int i, int j){
        String s = Integer.toString(i) + Integer.toString(j) + Integer.toString(i*j);
        if(s.length()!=9){
            return false;
        }
        for(int k = 1; k < 10; k++){
            if(!s.contains(Integer.toString(k))){
                return false;
            }
        }
        return true;
    }
    static boolean isInSum(int i, int j, int sum){
        String s = Integer.toString(i) + Integer.toString(j) + Integer.toString(i*j);
        for(int k = 1; k < 10; k++){
            if(!s.contains(Integer.toString(k))){
                return false;
            }
        }
        return true;
    }
}
