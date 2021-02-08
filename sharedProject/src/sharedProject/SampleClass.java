package sharedProject;
import java.util.Scanner;
public class SampleClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("give three numbers :");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		
		System.out.println((number1>number2 && number1>number3)?number1:(number2>number3 && number2>number1)?number2:number3);

	}

}
