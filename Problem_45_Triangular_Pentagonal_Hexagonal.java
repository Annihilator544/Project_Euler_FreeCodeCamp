import java.util.ArrayList;
public class Problem_45_Triangular_Pentagonal_Hexagonal {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        ArrayList<Integer> triangular = new ArrayList<Integer>();
        ArrayList<Integer> pentagonal = new ArrayList<Integer>();
        ArrayList<Integer> hexagonal = new ArrayList<Integer>();
        for(int i=1;i<100000;i++){
            triangular.add(i*(i+1)/2);
            pentagonal.add(i*(3*i-1)/2);
            hexagonal.add(i*(2*i-1));
        }
        System.out.println(triangular.size());
        System.out.println(pentagonal.size());
        System.out.println(hexagonal.size());
        for(int i=1;i<triangular.size();i++){
            if(pentagonal.contains(triangular.get(i))&&hexagonal.contains(triangular.get(i))){
                System.out.println(triangular.get(i));
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }

}
