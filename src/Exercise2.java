import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%-7s: ", "Inches");
		int inches = sc.nextInt();
		
		int miles = (inches - inches%(5280*12))/(5280*12);
		inches -= miles*(5280*12);
		int feet = (inches - inches%(12))/(12);
		inches -= feet*(12);
		
		System.out.printf("%n%-7s: %,d", "Miles", miles);
		System.out.printf("%n%-7s: %,d", "Feet", feet);
		System.out.printf("%n%-7s: %,d", "Inches", inches);

	}

}