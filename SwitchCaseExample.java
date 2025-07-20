import java.util.Scanner;
public class SwitchCaseExample {
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	System.out.println("Eneter a number from 1-3");
	int number = scan.nextInt();

	switch (number) {
   	 case 1:
        	System.out.println("One");
        	
    	case 2:
        	System.out.println("Two");
        	
    	case 3:
        	System.out.println("Three");
        	
    	case 4:
        	System.out.println("Four");
        	
		}
	}
}