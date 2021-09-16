package java_programs_04;

public class Recursion_36 {

	int factorial(int n)
	{
		int f;
		if(n==1)
		{
			return 1;
		}
		else
		{
			f = n * factorial(n-1);
		}
		return f;
	}
	public static void main(String[] args) {

		//Finding factorial of a number using recursion
		int x = 12;
		Recursion_36 r = new Recursion_36();
		System.out.println(r.factorial(x));
		
	}

}
