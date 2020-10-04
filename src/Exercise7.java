import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%-10s: ", "Side");
		double side = sc.nextDouble();
		
		double perimeter = 6 * side; 
		double area = 3 * Math.sqrt(3)/2 * side * side;
		
		System.out.printf("%n%-10s: %,.2f", "Area", area);
		System.out.printf("%n%-10s: %,.2f", "Perimeter", perimeter);
	}
}
