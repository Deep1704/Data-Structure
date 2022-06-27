//Write a program to find factorial of a number. (Using Loop)


import java.util.*;
public class Factorial_Using_Loop{
		public static void main(String []args){

			Scanner sc=new Scanner(System.in);

			System.out.print("Enter a Number :");
			int n=sc.nextInt();
			int fact=1;

			for(int i=1;i<=n;i++){

				fact=fact*i;
			}

			System.out.print("Factorial ="+fact);
	}
}