import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%-10s: ", "Length");
		double length = sc.nextDouble();
		System.out.printf("%-10s: ", "Width");
		double width = sc.nextDouble();
				
		double area = length * width;
		double perimeter = 2 * (length + width);
		double diagonal = Math.sqrt(length * length + width * width);
		
		System.out.printf("%n%-10s: %,.2f", "Area", area);
		System.out.printf("%n%-10s: %,.2f", "Perimeter", perimeter);
		System.out.printf("%n%-10s: %,.2f", "Diagonal", diagonal);
	}
}
