package batch10am;

public class SwapTwoVariables {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		int temp;
		System.out.println("Before Swapping:");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		temp=a;
		a=b;
		b=temp;
		
		
		System.out.println("After Swapping:");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		


	}

}
