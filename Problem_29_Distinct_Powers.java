public class Problem_29_Distinct_Powers {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int count = 0;
        for(int a = 2; a <= 100; a++){
            for(int b = 2; b <= 100; b++){
                if(isDistinct(a, b)){
                    count++;
                }
            }
        }
        System.out.println(count);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isDistinct(int a, int b){
        for(int i = 2; i <= a; i++){
            if(a % i == 0 && b % i == 0){
                return false;
            }
        }
        return true;
    }
}
