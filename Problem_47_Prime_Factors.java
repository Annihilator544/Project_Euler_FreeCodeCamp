import java.util.HashSet;
import java.util.Set;

public class Problem_47_Prime_Factors {
    public static void main(String args[])
	{
		int count = 0;
		int currentNum = 0;
		while (count < 4)
		{
			currentNum++;
			if (numPrimeFactors(currentNum) == 4)
			{
				count++;
				System.out.println(currentNum);
			}
			else
			{
				count = 0;
			}
		}
	}
	
	public static int numPrimeFactors(int number)
	{
		Set<Integer> primeFactors = new HashSet<>();
		for (int i = 2; i < number; i++)
		{
			while (number % i == 0)
			{
				primeFactors.add(i);
				number = number / i;
			}
		}
		if (number > 2)
		{
			primeFactors.add(number);
		}
		return primeFactors.size();
	}
}
