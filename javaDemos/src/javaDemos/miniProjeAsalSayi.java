package javaDemos;

public class miniProjeAsalSayi {

	public static void main(String[] args) 
	{
		int number = 25;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;
		
		if (number == 1)
		{
			System.out.println("sayı asal değildir");                 // defensive programing => korumacı programlama, yani kullanıcının doğru veriyi girmesini sağlama
		    return;                                                   // return bağlı bulunduğu fonksiyonu bitirir
		}
		
		if (number<1) 
		{
		  System.out.println("geçersiz sayı"); 	
		  return;
		}
		
		for(int i=2; i<number; i++)
		{
			if(number % i == 0)
			{
				isPrime = false;
			}
		}
		
		if(isPrime)
		{
			System.out.println("sayı asaldır");
		}
	    else
	    {
		   System.out.println("sayı asal değildir");	
		}
	}
}


