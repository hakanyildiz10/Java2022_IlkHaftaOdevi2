package javaDemos;

public class mukemmelSayi {

	public static void main(String[] args)
	{
		// 28 => 1 2 4 7 14 e bölünür ve tüm bölenlerin toplamı kendine eşit
		int number = 28;
		int total = 0;
		
		for(int i=0; i<number; i++)
		{
			if(number % i == 0)
			{
				total = total + i;
			}
		}
		
		if(total == number)
		{
			System.out.println("mükemmel sayı");
		}
		else System.out.println("mükemmel sayı değildir");

	}

}
