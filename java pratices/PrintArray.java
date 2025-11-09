// print array 
import java.util.*;

public class PrintArray{
	public static void main(String... args){
		int arr[] = {12, 3, 4, 5, 22, 5 ,44, 54};

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}

		System.out.println();

		for(int x : arr){
			System.out.print(x+ "  ");
		}

		System.out.println();

		System.out.print(Arrays.toString(arr));
	}
}