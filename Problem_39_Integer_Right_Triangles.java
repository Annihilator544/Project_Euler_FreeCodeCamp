public class Problem_39_Integer_Right_Triangles {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int max = 0;
        int maxP = 0;
        for(int p = 1; p <= 1000; p++){
            int count = 0;
            for(int a = 1; a < p; a++){
                for(int b = 1; b < p; b++){
                    int c = p - a - b;
                    if(c > 0){
                        if(a * a + b * b == c * c){
                            count++;
                        }
                    }
                }
            }
            if(count > max){
                max = count;
                maxP = p;
            }
        }
        System.out.println(maxP);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
}
