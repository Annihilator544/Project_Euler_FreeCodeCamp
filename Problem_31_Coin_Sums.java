public class Problem_31_Coin_Sums {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int count = 0;
        for(int a = 0; a <= 200; a++){
            for(int b = 0; b <= 100; b++){
                for(int c = 0; c <= 40; c++){
                    for(int d = 0; d <= 20; d++){
                        for(int e = 0; e <= 10; e++){
                            for(int f = 0; f <= 4; f++){
                                for(int g = 0; g <= 2; g++){
                                    for(int h = 0; h <= 1; h++){
                                        if(a + 2 * b + 5 * c + 10 * d + 20 * e + 50 * f + 100 * g + 200 * h == 200){
                                            count++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
}
