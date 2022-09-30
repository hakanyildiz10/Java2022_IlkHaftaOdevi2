package javaDemos;

public class switchDemo {

	public static void main(String[] args)
	{
		char grade ='e';
		
		switch (grade)
		{
		case 'A':                                        //ctrl + shift+ f ile kod satırları düzenlenir
			System.out.println("pek iyi ");
			break;                                           //case 'B':
		                                                     // case 'C':
		case 'B':                                            // syso ("iyi")   şeklinde yazılırsa hem B hem de C için aynı sonucu verir
			System.out.println("iyi");
			break;
		case 'C':
			System.out.println("orta");
			break;
		case 'D':
			System.out.println("geçer");
			break;
		case 'E':
			System.out.println("kaldı");
			break;
			default:
				System.out.println("geçersiz not");

	}

	}
}
