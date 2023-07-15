import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Problem_49_Prime_Permutations {
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        List<Integer> primes = new java.util.ArrayList<Integer>();
        List<List<Integer>> permutations = new java.util.ArrayList<List<Integer>>();
        for(int i = 1000; i < 10000; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        for(int i=0;i<primes.size();i++){
            for(int j=i+1;j<primes.size();j++){
                for(int k=j+1;k<primes.size();k++){
                    if(primes.get(i)!=primes.get(j)&&primes.get(j)!=primes.get(k)&&primes.get(i)!=primes.get(k)){
                        if(primes.get(j)-primes.get(i)==primes.get(k)-primes.get(j)){
                            String a = Integer.toString(primes.get(i));
                            String b = Integer.toString(primes.get(j));
                            String c = Integer.toString(primes.get(k));
                            
Set<Character> chars1 = new TreeSet<>();
for( char ce : a.toCharArray() ) {
  chars1.add(ce);
}
Set<Character> chars2 = new TreeSet<>();
for( char ce : b.toCharArray() ) {
  chars2.add(ce);
}
Set<Character> chars3 = new TreeSet<>();
for( char ce : c.toCharArray() ) {
  chars3.add(ce);
}
if(chars1.equals(chars2)&&chars2.equals(chars3)&&chars1.equals(chars3)){
                            List<Integer> temp = new java.util.ArrayList<Integer>();
                            temp.add(primes.get(i));
                            temp.add(primes.get(j));
                            temp.add(primes.get(k));
                            if(primes.get(i)/1000!=primes.get(j)/1000&&primes.get(j)/1000!=primes.get(k)/1000&&primes.get(i)/1000!=primes.get(k)/1000&&primes.get(i)/100!=primes.get(j)/100&&primes.get(j)/100!=primes.get(k)/100&&primes.get(i)/100!=primes.get(k)/100){
                            permutations.add(temp);}}
                            }
                    }
                }
            }
        }
        for(int i=0;i<permutations.size();i++){
            for(int j=0;j<3;j++){
                
            }
        }
        System.out.println(permutations);
        System.out.println(permutations.size());
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
}
