public class Problem_43_Sub_String_Divisibility {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        long sum = 0;
        for(long i = 1023456789; i < 9876543210L; i++){
            if(isPandigital(i)){
                if(isSubStringDivisible(i)){
                    sum+=i;
                }
            }
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isPandigital(long i){
        String s = Long.toString(i);
        if(s.length()!=10){
            return false;
        }
        for(int j = 0; j < 10; j++){
            if(!s.contains(Integer.toString(j))){
                return false;
            }
        }
        return true;
    }
    static boolean isSubStringDivisible(long i){
        String s = Long.toString(i);
        if(Integer.parseInt(s.substring(1, 4)) % 2 != 0){
            return false;
        }
        if(Integer.parseInt(s.substring(2, 5)) % 3 != 0){
            return false;
        }
        if(Integer.parseInt(s.substring(3, 6)) % 5 != 0){
            return false;
        }
        if(Integer.parseInt(s.substring(4, 7)) % 7 != 0){
            return false;
        }
        if(Integer.parseInt(s.substring(5, 8)) % 11 != 0){
            return false;
        }
        if(Integer.parseInt(s.substring(6, 9)) % 13 != 0){
            return false;
        }
        if(Integer.parseInt(s.substring(7, 10)) % 17 != 0){
            return false;
        }
        return true;
    }
}
