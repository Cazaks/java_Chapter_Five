import java.util.Scanner;
public class SwitchCaseCharacterExample {
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a grade from A, B, C, D and F: ");
	char grade = scan.next().charAt(0);

	switch (grade) {
   	case 'A':
	case 'a':
        	System.out.println("Excellent!");
        	break;
    	case 'B':
	case 'b':
        	System.out.println("Very good!");
        	break;
    	case 'C':
	case 'c':
        	System.out.println("Good!");
        	break;

    	case 'D':
	case 'd':
        	System.out.println("Fair, you can do better!");
        	break;

	case 'F':
	case 'f':
        	System.out.println("Sorry you failed");
        	break;

	default:
		System.out.println("Invalid input. Kindly enter a grade between A, B, C, D and F");

		}
	}
}