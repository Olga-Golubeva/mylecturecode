
public class OperatorsMath {


	public static void main(String[] args) {
		double num1 = 0.4;
		double num2 = 0.20;
		double result;
		double result1;
		double result2;
		double result3;
		char operators = '+';
		char sub = '-';
		char reiz = '*';
		char mod = '%';
		
		
		result = num1 + num2;
		result1 = num1 - num2;
		result2 = num1 * num2;
		result3 = num1 % num2;
		
		 
		System.out.println(num1+""+operators+""+ num2 +"="+result);
		System.out.println(num1+""+sub+""+ num2 +"="+result1);
		System.out.println(num1+""+reiz+""+ num2 +"="+result2); 
		System.out.println(num1+""+mod+""+ num2 +"="+result3); 
		
		
		int a = 11;
		int b = 3;
		int x = a % b;
		
		System.out.println("x = "+x);
		
		int i = 6;
		i++;
		System.out.println(i);
		
		int k = 2;
		//return increment result ++ increment by value 1
		int p = ++k;
		 System.out.println("p after increment: "+p);
		 
		 int o = 2;
		 int f = o++;
		 
		 System.out.println("f after increment: "+f);
		
	}

}
