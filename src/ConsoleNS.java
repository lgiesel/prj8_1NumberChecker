import java.util.Scanner;

public class ConsoleNS {//Does not use static methods
	//7-1 Imagine u dont have access to Console to modify it
    
    private static Scanner sc = new Scanner(System.in);

    public void printToConsole(String str) {//Create another method for data validation on input
    	System.out.println(str);
    }
    
    public String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }
    
	public String getString (String prompt, int maxLength) {
		boolean isValid = false;
		String s = "";
		while(!isValid) {
			s = getString(prompt);
			if (s.length()>maxLength) {
				System.out.println("Invalid input! Length must be up to " + maxLength + ".");
				sc.nextLine();
			} else {
				isValid=true;
			}			
		}
		return s;
	}    
		
    public int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }	

    public int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public  boolean getBoolean(String prompt) {
    	boolean b = false;
    	boolean isValid = false;
    	
    	while(!isValid) {
        	String s = getString(prompt);
        	if (s.equalsIgnoreCase("t") || s.equalsIgnoreCase("true")) {
        		b=true;
        		isValid=true;
        	} else if (s.equalsIgnoreCase("f") || s.equalsIgnoreCase("false")){
        		b = false;
        		isValid=true;
        	} else {
        		System.out.println("Invalid input. T, t, F, f expected.");    		
        	}
    	}
    	return b;
    }

    public double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }
    
}