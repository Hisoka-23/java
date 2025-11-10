//Write a java program to find min and max elements in the array
//			int arr[] = {12, 3, 4, 5, 22, 5 ,44, 54};

public class MinMax{
	public static void main(String... args){
		int arr[] = {12, 3, 4, 5, 22, 5 ,44, 54};

		int min = arr[0];
		int max = arr[0];

		for(int i=0; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.print("min : "+min + " ---- "+"max : "+max);
	}
}