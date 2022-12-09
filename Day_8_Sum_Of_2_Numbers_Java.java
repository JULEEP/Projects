import java.util.Scanner;
class Sum{
	public static void main(String args[]){

	int a,b,c;
	System.out.println("Enter the value of a");
	Scanner sc = new Scanner(System.in);
	 a = sc.nextInt();

	 System.out.println("Enter the value of b");
	 b = sc.nextInt();

	 c = a+b;
	 System.out.println("Sum of a and b is"+c);
	}
}