public class Problem_40_Champernowne_Constant {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        String s="";
        for(int i = 1; i <= 300000; i++){
            s+=i;
        }
        long product = 1;
        for(int i = 1; i <= 1000000; i*=10){
            product*=(long)s.charAt(i-1)-48;
            System.out.println(s.charAt(i-1));
        }
        System.out.println(product);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
}
