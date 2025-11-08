//6. Replace Char with Occurrence

public class charWithOccurance {
	public static void main(String[] args){
		String input = "openText";
		char charToReplace = 't';
		// expected output = opent1ex2

		//check char pressense in string
		if(input.indexOf(charToReplace)==-1){
			System.out.println("Given Character Not Available In Input String...!");
			System.exit(0);
		}
	}
}