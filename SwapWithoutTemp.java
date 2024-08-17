package batch10am;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		int temp;
		System.out.println("Before Swapping:");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("Before Swapping:");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

}
