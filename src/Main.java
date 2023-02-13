/*Welcome to the Java Cheat Sheet!!!
 * You can't use this during the competition, but it will help while you get started.
 * First off, import the java.util package. You can choose just the Scanner, or import .* if you are going to need random
 * 
 */
import java.util.Scanner; //or import java.util.*;
public class Main { //Your class has to be called MAIN

	public static void main(String[] args) { //This line makes it a main method.
		// First step? Make a Scanner. Copy this line EXACTLY
		Scanner in = new Scanner(System.in);
		
		//Reading in a string? Do this
		String strInput=in.nextLine();
		//Reading in a double?
		double dblInput=in.nextDouble();
		//Reading in an int?
		int intInput=in.nextInt();
		//After you read in a numerical format but before you read in a string, flush the buffer!
		in.nextLine();
		
		//Print out what you have
		System.out.println(strInput+" "+dblInput+" "+intInput);
		
		//Let's loop based on intInput
		/* First condition initializes a counter: x starts at 0
		 * Second condition says when to loop: as long as x is less than intInput
		 * Third condition says what to do to your counter after each loop: x goes up by 1
		 */
		for (int x=0;x<intInput;x++) {
			System.out.println("Loop #"+x);
		}
		
		
	}

}
