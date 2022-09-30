package javaDemos;

public class loopDemo {

	public static void main(String[] args) 
	{
		//FOR
		for(int i=1; i<=10; i+=2)                           //burada tanımlanan i sadece bu blokta geçerlidir, while bloğunda kullanmak için farklı i tanımlanmalı
		{
			System.out.println(i);
		}
		System.out.println("Döngü bitti");
		
		//WHILE
		int i =0;
		while(i<10) 
		{
			System.out.println(i);
			i++;
		}
		System.out.println("while döngüsü bitti");             //loglama => kim hangi operasyonu ne zaman ne şekilde çağırdı
		
		//Do-While
		int j = 1;
		do
		{
			System.out.println("loglandı");
		  System.out.println(j);
		  j+=2;
		}while(j<10);
		
		System.out.println("do-while döngüsü bitti");

	}

}
