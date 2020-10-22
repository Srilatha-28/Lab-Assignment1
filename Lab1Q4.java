import java.util.Arrays;

public class Lab1Q4 {
	public static void main(String []args)
	{
		System.out.println("Originalseries");
		int arr[]=new int[] {3,7,9,10,11};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int[] copy=Arrays.copyOf(arr,7);
		copy[5]=12;
		copy[6]=2;
		
		System.out.println("New array after copy ");
		for(int i=0;i<copy.length;i++)
		{
			System.out.println(copy[i]);
		}
	}

}
