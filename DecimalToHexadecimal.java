import java.util.Scanner;
public class DecimalToHexadecimal{
	
	public static void main(String []args){
		System.out.println("Enter number from 0 to 10000");
		Scanner myinput = new Scanner(System.in);
		int num = myinput.nextInt();
		System.out.println(" 2nd hexadecimal : " + Convert2ndDecimalToHexadecimal(num));
		System.out.println(" 10th hexadecimal : " + Convert10thDecimalToHexadecimal(num));
		
	}
	
	static String Convert10thDecimalToHexadecimal(int number){
		String hexadecimal = "";
		while (number > 0)
		{
			char leftNumber = (number % 16 >= 10) ? (char)('A' +number % 16 -10) : (char)(48 + number % 16);
			hexadecimal = leftNumber + hexadecimal;
			number /= 16;		
		}
		return hexadecimal;
	}
	//I am not sure is what excepted from  me to do since hexadecimal is 10 to 16
	
	static String Convert2ndDecimalToHexadecimal(int number){
		String hexadecimal = "";
		while (number > 0)
		{
			char leftNumber = (number % 16 >= 2) ? (char)('A' +number % 16 -2) : (char)(48 + number % 16);
			hexadecimal = leftNumber + hexadecimal;
			number /= 16;		
		}
		return hexadecimal;
	}
}