package week1.day2;

public class palindrome {
public static void main(String[] args) {
	int num =34343;
	int temp =0;
	int rnum=num;
	while(num!=0) {
		temp=temp*10+num%10;
		num/=10;
			}
	if(rnum==temp) {
		System.out.println("The given number is palindrome");}
	else {
		System.out.println("The given number is not palindrome");
	}
}

}
