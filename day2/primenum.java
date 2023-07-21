package week1.day2;

public class primenum {
	public static void main(String[] args) {
	    int num = 0;
	    boolean bool= false;
	    for (int i = 2; i <=num / 2; i++) {
	        if (num % i == 0) {
	            bool = true;
	            break;
	        }
	    }
	    if (!bool) {
	        System.out.print("The given number is Prime number");
	    } 
	    else {
	        System.out.print("The given numer is not a Prime");
	        }
	}

}
