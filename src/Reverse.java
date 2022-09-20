
public class Reverse {
//public static void main(String[] args) {
//	String name="darshan";
//	int length=name.length();
//	String rev="";
//	for (int i =length-1; i>=0; i--) {
//		rev= rev+name.charAt(i);
//	}
//	System.out.println(rev);
//}'
	
	public static void main(String[] args) {
		
	int a=12345,rem,rev=0;
	while (a!=0) {
		rem=a%10;
		rev=rev*10+rev;
		a=a/10;
	}
	System.out.println(rev);
	}
}
