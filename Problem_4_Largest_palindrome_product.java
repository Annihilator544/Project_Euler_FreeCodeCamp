public class Problem_4_Largest_palindrome_product {
    static void largestPalindromeProduct(int i){
        int j=9;
        while(i>1){
            j*=10;
            j+=9;
            i--;
        }
        int max=0;
        for(int k=j;k>0;k--){
            for(int l=j;l>0;l--)
            if(palindrome(l*k)){
                if(l*k>max){
                    max=l*k;
                }
                break;
            }
        }
        System.out.println(max);
    }
    static boolean palindrome(int i){
        int num=i;
        int rev=0;
        while(i>0){
            rev*=10;
            rev+=i%10;
            i/=10;
        }
        if(rev==num)
            return true;
         else 
            return false;

    }
    public static void main(String[] args){
        largestPalindromeProduct(2);
        largestPalindromeProduct(3);
    }
}
