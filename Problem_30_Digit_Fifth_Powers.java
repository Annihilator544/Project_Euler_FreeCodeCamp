public class Problem_30_Digit_Fifth_Powers {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int sum = 0;
        for(int i = 2; i < 1000000; i++){
            if(isDigitFifthPower(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isDigitFifthPower(int n){
        int sum = 0;
        int temp = n;
        while(temp > 0){
            sum+=Math.pow(temp%10, 5);
            temp/=10;
        }
        return sum == n;
    }
}
