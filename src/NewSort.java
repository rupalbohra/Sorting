import java.util.Scanner;
public class NewSort
{
	void sort(int arr[])
	{
		int n = arr.length;

		for (int i = 0; i < n-1; i++)
		{
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
	


	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}


	public static void main(String args[])
	{
		NewSort ob = new NewSort();
		System.out.println("Enter the no. of elements to be sorted: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter elements of the array: ");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}

