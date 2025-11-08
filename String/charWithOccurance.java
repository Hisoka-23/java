//6. Replace Char with Occurrence

import java.util.*;

public class charWithOccurance {
	public static void main(String[] args){
		String input = "deloitte";
		char charToReplace = 't';
		// expected output = opent1ex2

		//check char pressense in string
		if(input.indexOf(charToReplace)==-1){
			System.out.println("Given Character Not Available In Input String...!");
			System.exit(0);
		}


		//logic to replace char occurence in string
		for(int i=0; i<input.length(); i++){
			char ch = input.charAt(i);
			if(ch == charToReplace){//t==t -------
				input = input.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
				cnt++;
			}
		}

		System.out.print(input);


		/*//logic to replace charj occurance in string...
		char[] arr = input.toCharArray();//open text
		int cnt = 1;
		for(int i=0; i<arr.length; i++){
			if(arr[i]== charToReplace){//0==t p==t e==t n==t t==t
				arr[i] = String.valueOf(cnt).charAt(0);
				cnt ++;
			}
		}

		System.out.println(Arrays.toString(arr));*/
	}
}