public class Problem_38_Pandigital_Multiples {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int max = 0;
        for(int i = 1; i < 10000; i++){
            String s = "";
            for(int j = 1; j < 10; j++){
                s+=i*j;
                if(s.length() == 9){
                    if(isPandigital(s)){
                        if(Integer.parseInt(s) > max){
                            max = Integer.parseInt(s);
                        }
                    }
                }
                if(s.length() > 9){
                    break;
                }
            }
        }
        System.out.println(max);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isPandigital(String s){
        if(s.length()!=9){
            return false;
        }
        for(int i = 1; i < 10; i++){
            if(!s.contains(Integer.toString(i))){
                return false;
            }
        }
        return true;
    }
}
