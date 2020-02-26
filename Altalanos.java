import java.util.Scanner;

public class Altalanos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Ad meg a tantárgyat:");
		String t = sc.nextString();
		System.out.println("Add meg a jegyek szamat:");
		int i = sc.nextInt();
		System.out.println("Add meg a jegyek erteket, az utolso a felevi dolgozat.");
		int k = i-1;
		float jegy = 0;
		do {
		jegy = jegy + sc.nextInt();
		i = i - 1;
		}
		while (i > 1);
		System.out.println("Ez a felevi dolgozat.");
	int fd = sc.nextInt();
	sc.close();
	float media = ((jegy / k) * 3 + fd ) / 4;
	System.out.println("A jegyek összege: " + jegy + ".");
	System.out.println("A jegyek átlaga: " + jegy / k + ".");
	System.out.println("A jegyek száma: " + k + ".");
	System.out.println("A tantargy: " + t + ".");
	System.out.println("A média: " + media + ".");

	}
}
