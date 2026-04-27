//Exceptions test: trying to divide a number by 0, trying to divide a number by a string

import java.util.*;

public class ExceptionsTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //moved out of the try block so we can close it with the finally block later
		try{ //risky code inside of try block

			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();
		
			System.out.println("Enter a whole number to divide by: ");
			int y = scanner.nextInt();

			int z = (x) / (y);

			System.out.println("result: " + z);
		}
		catch(ArithmeticException e) { //catch the divide by 0 (arithmetic) exception
			System.out.println("You can't divide by 0!");
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter a number!");
		}
		catch(Exception e) {
			System.out.println("Something went wrong"); //catches everything, last resort
		}
		finally {
			scanner.close();
		}




	}
}