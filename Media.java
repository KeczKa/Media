import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
			System.out.println("Add meg a jegyek szamat:");
			int i = sc.nextInt();
			System.out.println("Add meg a jegyek erteket, az utolso a felevi dolgozat.");
			int k = i-1;
			int jegy = 0;
			do {
			jegy = jegy + sc.nextInt();
			i = i - 1;
			}
			while (i > 1);
			System.out.println("Ez a felevi dolgozat.");
		int fd = sc.nextInt();
		int media = (jegy / k * 3 + fd )/4;
		System.out.println("A media: " + media + ".");
		}
	}
