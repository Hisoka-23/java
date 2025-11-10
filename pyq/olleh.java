import java.util.*;

class olleh{
	public static void main(String... args){
		String str = "racecar";

		String rev = "";

		for(int i=str.length()-1; i>=0; i--){
			rev += str.charAt(i);
		}

		if(str.equals(rev)){
			System.out.println("Sahi");
		}else{
			System.out.println("Nahi");
		}
	}
}