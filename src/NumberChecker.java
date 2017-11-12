
public class NumberChecker {

	public static void main(String[] args) {
		
		MyConsole c = new MyConsole();
				
		c.printToConsole("Welcome to the Odd/Even Checker!");
		c.printToConsole("");
		
		String choice = "Y";
		while(choice.equalsIgnoreCase("y")){
			int i = c.getInt("Enter an integer:\t");
			String s = evaluateOddEven(i);
			c.printToConsole(s);
			c.printToConsole("");
			
			choice = c.getString("Continue? y/n:\t");				
			c.printToConsole("");
		}
		
		c.printToConsole("Bye!");
	}
	
	private static String evaluateOddEven (int number) {
		String s = "";
		int m = number % 2;
		if (m == 0) {
			s = "The number " + number + " is even";
		} else {
			s = "The number " + number + " is odd";			
		}
		return s;
	}

}
