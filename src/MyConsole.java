import java.util.Scanner;

public class MyConsole extends ConsoleNS {
		
	private static Scanner sc = new Scanner(System.in);
	
	public MyConsole() {
		super();
	}
	
	@Override
	public  String getString(String prompt) {
		
		boolean isValid = false;
		String s = "";
		while(!isValid) {
	        System.out.print(prompt);
	        s = sc.next();
            if (s.equalsIgnoreCase("y")) {
                isValid = true;                
            } else if (s.equalsIgnoreCase("n")) {
                isValid = true;                
            } else {
                printToConsole("Error! Entry must be Y or N. Try again.");
            }	        
		}
	    return s;
    }

}    