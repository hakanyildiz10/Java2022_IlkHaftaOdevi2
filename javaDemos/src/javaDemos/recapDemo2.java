package javaDemos;

public class recapDemo2 {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };             // dizilerin farklı yazılışı
		double total = 0;
		double max = myList[0];                               // dizinin en büyük elemanını bulmak
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}

		System.out.println("toplam " + total);
		System.out.println("en büyük " + max);
	}

}
