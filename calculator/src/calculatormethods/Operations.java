package calculatormethods;

public class Operations {
	 public int add(int number1,int number2)
	    {
	        return (number1+number2);
	    }
	    public int subraction(int number1,int number2)
	    {
	         return (number1-number2);
	    }
	    public int multiply(int number1,int number2)
	    {
	        return (number1*number2);
	    }
	    public double division(int number1,int number2)
	    {
	    	double num1=0.0;
	       try
	       {
	    	   num1=number1/number2;
	       }
	       catch(ArithmeticException ae)
	       {
	    	   System.out.println("Divide by zero is not possible");
	       }
	       return num1;
	    }

}
