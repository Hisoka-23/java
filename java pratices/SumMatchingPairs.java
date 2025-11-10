//Sum Of Matching Pairs 

public class SumMatchingPairs{
	public static void main(String... args){
		int[] arr = {5, 6, 7, 6, 9, 3};

		int sum = 8;

		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] + arr[j] == sum){
					System.out.print(arr[i] +" + "+ arr[j] +" = "+ sum);
				}
			}
		}
	}
}