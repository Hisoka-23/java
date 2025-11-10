//Write a java program to reverse an array ?
// int arr[] = {15 , 89, 34, 44, 22, 33, 45, -98, 34, 89};

public class ReverseArray{
	public static void main(String... args){
		int arr[] = {15 , 89, 34, 44, 22, 33, 45, -98, 34, 89};
		//int rev[] = new int[arr.length];
		int temp = 0;

		for(int i=0; i<arr.length/2; i++){
			//rev[i] = arr[arr.length - 1 -i];
			temp = arr[i];
			arr[i] = arr[arr.length - 1  - i];
			arr[arr.length - 1 - i] = temp;
		}

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}