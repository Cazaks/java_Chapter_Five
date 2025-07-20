import java.util.Scanner;
public class WordChecking {
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
		String addWords = "";

		System.out.println("Enter word, enter 'done' to exit: ");
		while(scan.hasNext()){
		String words = scan.next();

			if(words.equalsIgnoreCase("done")){
			break;
			}
		addWords += words + " ";
		}
		System.out.println(addWords + " ");
	}
}