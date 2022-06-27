// Write a program to check whether a number is prime or not.

import java.util.*;
public class PrimeNumber{
	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number :");
		int n=sc.nextInt();
		boolean flag=true;

		for(int i=2;i<=n/2;i++){

			if(n%i==0){

				flag=false;
				break;
			}
			
		}
		if(flag){

			System.out.print("Given number is prime");

		}
		else{

			System.out.print("Given number is not prime");n
		}
	}
}
