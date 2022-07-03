//Read n numbers in an array then read two different numbers, replace 1st number with 2nd number 
//in an array and print its index and final array.


import java.util.Scanner;
public  class Replace_Number_In_Array{
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);

		// Read Array
		System.out.print("Enter size of array : ");
		int n=sc.nextInt();

		int array[] = new int[n];

		for(int i=0;i<n;i++){
			System.out.print("Enter array element : ");
			array[i]=sc.nextInt();
		}
		// Read two numbers
		System.out.print("Enter number which will be replaced : ");
		int a=sc.nextInt();

		System.out.print("Enter number which will be new number : ");
		int b=sc.nextInt();

		System.out.println("-----------------------------------------");

		// find and replace number
		boolean flag=true;
		for(int i=0;i<n;i++){

			if(array[i]==a){

				System.out.println("Number has found at index "+i);
				array[i]=b;
				flag=false;
			}
		}
		if(flag){

			System.out.print("You number is not found");

		}

		// print new array
		if(!flag){

			System.out.println("----New Array----");
			for(int i=0;i<n;i++){
			System.out.println("Array element : "+array[i]);

			}
		}
		
	}
}