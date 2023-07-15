import java.util.*;
public class Problem_44_Pentagon_Numbers {
    public static void main(String[] args){
        List<Long> pentagonal = new ArrayList<Long>();
        for(int i = 1; i < 10000; i++){
            pentagonal.add((long) (i * (3 * i - 1) / 2));
        }
        for(int i = 0; i < pentagonal.size(); i++){
            for(int j = i + 1; j < pentagonal.size(); j++){
                long sum = pentagonal.get(i) + pentagonal.get(j);
                long diff = pentagonal.get(j) - pentagonal.get(i);
                if(pentagonal.contains(sum) && pentagonal.contains(diff)){
                    System.out.println(diff);
                    return;
                }
            }
        }
    }
}
