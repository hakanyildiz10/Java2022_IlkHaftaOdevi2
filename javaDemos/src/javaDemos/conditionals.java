package javaDemos;

public class conditionals {

	public static void main(String[] args) 
	{
		int sayi =20;
		if(sayi < 20)
		{
			System.out.println("Sayı 20'den küçüktür.");             // = < veya > işaretlerine operatör denir
		}
		else if (sayi == 20)
		{
			System.out.println("Sayı 20'ye eşittir.");
		}
		else
		{
			System.out.println("Sayı 20'den küçük değildir.");
		}

	}

}
