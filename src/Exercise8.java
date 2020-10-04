import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%-10s: ", "String");
		String str = sc.nextLine();
		
		int length = str.length();
		int mid = (int) (length/2);
		
		String reverse = str.substring(mid,length).concat(str.substring(0,mid)).toUpperCase();
				
		System.out.printf("%n%s.", reverse);
	}
}
