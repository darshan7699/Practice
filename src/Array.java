import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the size");
	int size=scanner.nextInt();
	int[] a=new int[size];
	for (int i = 0; i < a.length; i++) {
		a[i]=scanner.nextInt();
	}
	for (int i = 0; i < a.length; i++) {
		if(a[i]%2!=0) {
			System.out.println(a[i]);
		}else {
		}
	}
}}
	
  

