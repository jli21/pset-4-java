import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("%-12s: ", "First name");
		String firstName = sc.nextLine();
		System.out.printf("%-12s: ", "Middle name");
		String middleName = sc.nextLine();
		System.out.printf("%-12s: ", "Last name");
		String lastName = sc.nextLine();
		
		String intials = (firstName.substring(0,1) + Character.toString(middleName.charAt(0)) + lastName.substring(0,1)).toUpperCase();
		
		System.out.printf("%n%s.", intials);
	}
}
