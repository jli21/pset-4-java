import java.util.Scanner;

public class Exercise10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%s ", "Whats your favorite city?");
		String city = sc.nextLine();

		
		int len = city.length();
		String upper = city.toUpperCase();
		String lower = city.toLowerCase();
		
		
		System.out.printf("%n%-7s : %s", "Text", city);
		System.out.printf("%n%-7s : %d", "Length", len);
		System.out.printf("%n%-7s : %s", "Upper", upper);
		System.out.printf("%n%-7s : %s", "Lower", lower);
		
	}

}