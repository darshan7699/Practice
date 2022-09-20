import java.util.Arrays;
import java.util.Collection;

public class Techo {
public static void main(String[] args) {
	int[] a = {12,10,15,2,4,5};
	Arrays.sort(a);
	
	for (int i=a.length-1;i>=0; i--) {
		System.out.println(a[i]);
	}
}
}
