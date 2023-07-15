public class Problem_36_Double_base_Palindromes {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int sum = 0;
        for(int i = 1; i < 1000000; i++){
            if(isPalindrome(Integer.toString(i))){
                if(isPalindrome(Integer.toBinaryString(i))){
                    sum+=i;
                }
            }
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isPalindrome(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
