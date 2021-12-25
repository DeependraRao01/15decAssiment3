package assiment3;
import java.util.Scanner;

public class findmaxno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		System.out.println("Enter second number : ");
		int b=sc.nextInt();
		System.out.println("Enter third number : ");
		int c=sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("The largest number is : "+a);
			}
			else {
				System.out.println("The largest number is : "+c);
				
			}
		}
		else if(b>a) {
			if(b>c) {
				System.out.println("The largest number is : "+b);
			}
			else {
				System.out.println("The largest number is : "+c);
				
			}
		}
	}

}
