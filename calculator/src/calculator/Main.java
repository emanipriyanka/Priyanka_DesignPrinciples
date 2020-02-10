package calculator;
import java.util.Scanner;

import calculatormethods.Operations;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations object=new Operations();
		Scanner sc=new Scanner(System.in);
		int number1,number2,choice;
		boolean flag=true;
		int choose=1;
		while(flag)
		{
			System.out.println("Enter number1");
			number1=sc.nextInt();
			System.out.println("Enter number2");
			number2=sc.nextInt();
			System.out.println("1.Addition\n 2.Subraction\n 3.Multiplication 4.Division\n 5.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			if(choice>4 || choice<=0)
			{
				System.out.println("Please enter correct number");
				break;
			}
			switch(choice)
			{
			case 1:System.out.println("Addition of "+number1+","+number2+" is "+object.add(number1, number2));break;
			case 2:System.out.println("Subraction of "+number1+","+number2+" is "+object.subraction(number1, number2));break;
			case 3:System.out.println("Multiplication of "+number1+","+number2+" is "+object.multiply(number1, number2));break;
			case 4:System.out.println("Division of "+number1+","+number2+" is "+object.division(number1, number2));break;
			default:return;
			}
			System.out.println("If you want to perform further operations or not true/false");
			choose=sc.nextInt();
			if(choose==0)
			{
				break;
			}
				
	}
	}
}
