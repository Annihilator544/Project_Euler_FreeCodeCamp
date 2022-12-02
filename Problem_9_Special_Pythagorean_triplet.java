public class Problem_9_Special_Pythagorean_triplet {
    public static void main(String[] args){
        specialPythagoreanTriplet(24);
        specialPythagoreanTriplet(120);
        specialPythagoreanTriplet(1000);
    }

    static void specialPythagoreanTriplet(int i){
    for (int k=1;k<=i;k++){
        for (int l=1;l<=i;l++){
            for (int m=1;m<=i;m++){
                if((k+l+m)==i){
                    if((k*k+l*l)==m*m){
                    System.out.println(l*m*k);
                }
            }
        }
    }
}
}

}