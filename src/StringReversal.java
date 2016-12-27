import java.util.Scanner;


public class StringReversal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		
		while (input.hasNextLine()) {
			String inputString = input.nextLine();
			for(int index=inputString.length()-1; index >= 0; index--) {
				builder.append(inputString.charAt(index));
			}
			break;
		}
		
		input.close();
		System.out.println(builder.toString());
	}
	
	

}
