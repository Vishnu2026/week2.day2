package week1.day2;

public class fibo {
 public static void main(String[] args) {
	 int a=0;
	 int b=1;
	 System.out.println("the first number" + a);
	 System.out.println("the first number" + b);
	 for(int i=1;i<8;i++) {
		int s=a+b;
		a=b;
		b=s;
		System.out.println("the fibonaci series " + s );
	 }
		 
 }
}
