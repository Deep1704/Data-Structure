//Write a program to find factorial of a number. (Using Recursion)


import java.util.*;
class Factorial{
	int fact=1;
	public int FactorialDemo(int n){

		if(n==0 || n==1){

			return 1;
		}
		else{

			return n*FactorialDemo(n-1);
		}	
	}
}

public class Factorial_Using_Recursion{
	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		Factorial fact1 = new Factorial();
		int answer=fact1.FactorialDemo(n);
		System.out.println("Factorial = "+answer);
	}
}	

