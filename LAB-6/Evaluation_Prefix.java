//Write a program for evaluation of pre-fix Expression using Stack.

import java.util.Scanner;
class prefix_convert{
    static int a[]=new int[100];
    static char temp;
    static int top=-1,value=0,s;

    public static void push(int c){
        if(top>=100){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            a[top]=c;
        }
    }
    public static int pop(){
        if(top<0){
            System.out.println("Stack Underflow");
        }
        else{
            s=a[top];
            top--;
            return s;
        }
        return 0;
    }
    public static void prefixstring(String str2){
        for(int i=0;i<str2.length();i++){
            temp=str2.charAt(i);
                if(Character.isDigit(temp)){
                    int d=(int)temp-48;
                    push(d);
                }
                else{
                    int operand2=pop();
                    int operand1=pop();

                    switch(temp){

                        case '+':
                        value=operand1+operand2;
                        push(value);
                        break;

                        case '-':
                        value=operand1-operand2;
                        push(value);
                        break;

                        case '*':
                        value=operand1*operand2;
                        push(value);
                        break;

                        case '/':
                        value=operand1/operand2;
                        push(value);
                        break;

                    }
                }
        }
        System.out.println("Your Output is:"+a[top]);
    }
}
public class Evaluation_Prefix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Expression:");
        String str=sc.next();
        String str2="";
        char ch;
        for(int i=str.length()-1;i>=0;i--){
            ch=str.charAt(i);
            str2+=ch;
        }

        prefix_convert.prefixstring(str2);
    }
}