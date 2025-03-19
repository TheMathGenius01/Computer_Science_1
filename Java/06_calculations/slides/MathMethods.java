import static java.lang.System.*;

public class MathMethods{
  public static void main(String[] args) {
  	
		out.printf("%.1f\n", Math.floor(3.2));		//		= 3.0
		out.printf("%.1f\n", Math.floor(-4.5));		//		= -5.0
		out.printf("%.1f\n", Math.ceil(2.2));		//		= 3.0
		out.printf("%.1f\n", Math.ceil(-1.9));		//		= -1.0
		
		out.printf("%.1f\n", Math.pow(2,7)); 		//		= 128.0
		out.printf("%.2f\n", Math.pow(2,-5)); 		//		= 0.03
		out.printf("%.1f\n", Math.sqrt(256));		//		= 16.0
		out.printf("%.1f\n", Math.sqrt(144));		//		= 12.0

		out.printf("%d\n", Math.abs(-9));		//		= 9
		out.printf("%.1f\n", Math.abs(3.4));		//		= 3.4
		out.printf("%d\n", Math.round(3.6));		//		= 4
		out.printf("%d\n", Math.round(2.5));		//		= 3
		out.printf("%d\n", Math.round(-2.5f));		//		= -2

		out.printf("%d\n", Math.max(5,7));		//		= 7
		out.printf("%.1f\n", Math.max(5.0,-7));		//		= 5.0
		out.printf("%d\n", Math.min(5,7));		//		= 5
		out.printf("%.1f\n", Math.min(5,-7.0));		//		= -7.0
		
		out.println(Math.PI);				// 		constant
		out.println(Math.E);				// 		constant
  }
}