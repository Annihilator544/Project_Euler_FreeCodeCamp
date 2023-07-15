public class Problem_28_Number_Spiral_Diagonals {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int sum = 1;
        int n = 1;
        for(int i = 3; i <= 1001; i+=2){
            for(int j = 0; j < 4; j++){
                n+=i-1;
                sum+=n;
            }
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
}
