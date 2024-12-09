import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("Please enter 5 input");
		
		for(int i=0;i<arr.length;i++)
		try {
			System.out.println("Enter Integer "+(i+1)+":");
			String input=scan.nextLine();
			
			arr[i] = Integer.parseInt(input);
		} 
		catch (NumberFormatException e) {
			System.out.println("Invalid input,Please give valid input");
		}
		
		for(int num : arr)
		{
			System.out.print(num + " ");
		}
		scan.close();
	}

}

