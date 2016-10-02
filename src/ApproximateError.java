import java.util.Scanner;
 
public class ApproximateError{
	
public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Let us consider our equation is like below :" +
				"\nax^n + bx^n-1 + ...... + z");
		
		System.out.println("\nEnter n value :");
		int n = Integer.parseInt(scan.nextLine());
		int temp = n;
		float num[] = new float[n+1];
		
		for(int i=0; i<=n; i++) {
			
			System.out.println("Enter the Co-efficient of x^" + (temp-i) + " :");
			num[i] = Float.parseFloat(scan.nextLine());
		}
		
		System.out.println("Enter x value :");
		float xValue = Float.parseFloat(scan.nextLine());
		
		for(int i=0; i<n; i++) {
			
			String str = (temp-i) * num[i] + " x^" + (temp-i-1);
			System.out.println(str);
		}
		
		System.out.println(xValue);
		
		System.out.println("\nDifferentiation Calculus One");
		System.out.println("Enter h value n-1 :");
		float hValue = Float.parseFloat(scan.nextLine());
		System.out.println(hValue);
		float xPlushValue = xValue + hValue;
		float fOne=0, fTwo=0;
		
		for(int i=0; i<n; i++) {
			
			fOne = fOne + (float) ((Math.pow((float)xPlushValue, (int)(temp-i))) * (num[i]));
			fTwo = fTwo + (float) ((Math.pow((float)xValue, (int)(temp-i))) * (num[i]));
		}
		
		float approxValueOne = (fOne - fTwo) / hValue;
		System.out.println("Approximate Value n-1:");
		System.out.println(fOne +"-"+fTwo+"/"+hValue+"= "+approxValueOne);
		
		System.out.println("\nDifferentiation Calculus Two");
		System.out.println("Enter h value n :");
		float hValueTwo = Float.parseFloat(scan.nextLine());
		System.out.println(hValueTwo);
		float xPlushValueTwo = xValue + hValueTwo;
		fOne=0;
		
		for(int i=0; i<n; i++) {
			
			fOne = fOne + (float) ((Math.pow((float)xPlushValueTwo, (int)(temp-i))) * (num[i]));
		}
		
		float approxValueTwo = (fOne - fTwo) / hValueTwo;
		System.out.println("Approximate Value n:");
		System.out.println(fOne +"-"+fTwo+"/"+hValueTwo+"= "+approxValueTwo);
		
		float approxErrorResult = approxValueTwo - approxValueOne;
		System.out.println("\nApproximate Error Result:");
		System.out.println(approxValueTwo+"-" +approxValueOne +"="+ approxErrorResult);
		
		float relativeApproxErrorResult = approxErrorResult/approxValueTwo;
		System.out.println("\nRelative Approximate Error Result:");
		System.out.println(approxErrorResult+"/"+approxValueTwo+"= "+relativeApproxErrorResult);
		
	}
}