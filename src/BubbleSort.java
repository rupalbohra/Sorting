import java.util.*;
import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to be sorted: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter elements:");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		

		
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		System.out.println("Sorted Array is: ");
		for(int k = 0; k< n; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
	}

}


