package batch10am;

public class Largest3 {

	public static void main(String[] args) {
         int a=-1000;
         int b=-1000;
         int c=34;
         int max;
         
         max = a>b ?  (a>c?a:c) : (b>c ? b:c);
         
         System.out.println("max of 3 number:  " + max);

	}

}
