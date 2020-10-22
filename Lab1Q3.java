import java.util.Scanner;
public class Lab1Q3 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float sum=0,average;
		System.out.println("Enter the number of students:");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the grade for student"+(i+1));
			arr[i]=sc.nextInt();
			if(arr[i]>100)
			{
				System.out.println("Invalid grade,try again...");
			}
			
			
			sum=sum+arr[i];
		}
		average=sum/num;
		System.out.println("The average is: "+average);
		
	}
}
