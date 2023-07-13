class Problem_1_Multiples_of_3_and_5 {
static int multiplesof3and5(int i)
{
    int sum = 0;
    for (int j = 0; j < i; j++)
    {
        if (j % 3 == 0)
        {
            sum += j;
        }
        if (j % 5 == 0)
        {
            sum += j;
        }
        if (j % 15 == 0)
        {
            sum -= j;
        }

       
    }
    System.out.println(sum);
    return sum;
}
public static void main(String[] args)
{
    multiplesof3and5(49);
    multiplesof3and5(1000);
    multiplesof3and5(8456);
}
}
