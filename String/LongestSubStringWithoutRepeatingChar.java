//7. Find Longest Substring.

import java.util.*;

public class LongestSubStringWithoutRepeatingChar{
	public static void main(String[] args){
		LengthOfLongestSubString("abbac");
	}

	public static void LengthOfLongestSubString(String s){
		String LongestSubString = null;
		int LongestSubstringLength = 0; 

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		char[] arr = s.toCharArray();
		
		for(int i=0; i<arr.length; i++){
			char ch = arr[i];

			if(!map.containsKey(ch)){
				map.put(ch, i);
			}else {
				i = map.get(ch);
				map.clear();
			}

			if(map.size() > LongestSubstringLength){
				LongestSubstringLength = map.size();
				LongestSubString = map.keySet().toString();
			}
		}

		System.out.println("The Longest substring : " + LongestSubString);
		System.out.println("The Longest substring : " + LongestSubstringLength);

	}
}