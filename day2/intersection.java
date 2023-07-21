package week1.day2;

public class intersection {

	public static void main(String[] args) {
		int arr1[]={9,8,4,0,5,6,1,2};
		int arr2[]={7,9,0,4,0,2,3,5};
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++) {
				if(arr1[i]==arr2[j])
				{
					System.out.println("the intersection number are " + arr1[i]);
					break;
				}
			}
		}
		}
}
