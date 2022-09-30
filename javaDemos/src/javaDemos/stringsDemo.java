package javaDemos;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		/*System.out.println("Eleman sayısı: " + mesaj.length());       // her bir harfi eleman olarak kabul eder
		System.out.println("5.eleman : " + mesaj.charAt(4));          // dizinin 4. elemanı olarak düşünülebilir veya buradaki n
																      // harfi gibidir
		System.out.println(mesaj.concat(" Yaşasın!"));                // concat birleştirmek demektir, mesaj ile birleştirir, boşluk da bir karakterdir
		System.out.println(mesaj.startsWith("B"));			          // mesaj b ile başlayıp başlamamasını kontrol eder, yani boolean döndürür 								              
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
	    mesaj.getChars(0, 5,karakterler , 0);                         // mesajdaki 0. karakterden 5. karaktere kadar olanları yazdırır
	    System.out.println(karakterler);
	    System.out.println(mesaj.indexOf('a'));                       //ilk bulduğu a nın kaçıncı karakter olduğunu bulur ve yazdırır
	    System.out.println(mesaj.lastIndexOf("e"));*/
	
		String yeniMesaj = mesaj.replace(' ', '-');                   // ilki oldChar değişen, ikincisi newChar değiştiren
		System.out.println(yeniMesaj);
	    System.out.println(mesaj.substring(2,5));                       // ikinci index ten itibaren yazdır
	    for (String kelime : mesaj.split(" "))                          // boşluktan itibaren kelimleri alt alta yazdırır
	    {
	    	System.out.println(kelime);
	    }
	    
	    System.out.println(mesaj.toLowerCase());
	    System.out.println(mesaj.toUpperCase());                       // veritabanlarında arama ifadelerinde kullanılır
	    System.out.println(mesaj.trim());                              // başındaki ve sonundaki boşlukları atar
	}

}
