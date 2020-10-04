import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%-12s: ", "Centimeters");
		int centimeter = sc.nextInt();
		
		int kilometer = (centimeter - centimeter%(100000))/(100000);
		centimeter -= kilometer*(100000);
		int meter = (centimeter - centimeter%(100))/100;
		centimeter -= meter*(100);
		
		System.out.printf("%n%-12s: %,d", "Kilometers", kilometer);
		System.out.printf("%n%-12s: %,d", "Meters", meter);
		System.out.printf("%n%-12s: %,d", "Centimeters", centimeter);
	}
}
