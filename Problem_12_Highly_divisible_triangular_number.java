public class Problem_12_Highly_divisible_triangular_number {
    static void divisibleTriangleNumber(int i){
        i++;
        int triag_num=0;
        int k=1;
        int tri;
        int x=1;
            while(x!=0){
                int count=0;
               tri=k*(k+1)/2;
                for(int l=1;l<=tri;l++){
                    if(tri%l==0){
                        count++;
                    }
                }
                if(count==i){
                    triag_num=tri;
                    x=0;
                }
                k++;
            }
            System.out.println(triag_num);
        
    }
    public static void main(String[] args){
        divisibleTriangleNumber(5);
        divisibleTriangleNumber(23);
        divisibleTriangleNumber(167);
        divisibleTriangleNumber(374);
        divisibleTriangleNumber(500);
    }
}
