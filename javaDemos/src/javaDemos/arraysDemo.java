package javaDemos;

public class arraysDemo {

	public static void main(String[] args)
	{
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		
		//1.yontem
		for(int i=0; i<ogrenciler.length; i++)
		{
			System.out.println(ogrenciler[i]);
		}
		
		//2.yontem
		for(String ogrenci : ogrenciler)               //ogrenciler dizisindeki her bir elemanı gez demektir, ogrenci kısmına istediğini yazabilirsin ama ogrenciler içinde ogrenci olur o yuzden best practice(işin doğru yapılması) önemli
		{
			System.out.println(ogrenci);
		}

	}

}
