package array;

import java.util.Arrays;

public class ArrayRessignment {

	public static void main(String[] args) {

		int[] a = new int[2];
		a[0]=2;
		a[1]=3;


		
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		
		int[] b = new int [1];
		b[0]=12;
		
		System.out.println(Arrays.toString(b));
		System.out.println(b.length);
		
		b=a;
		System.out.println(Arrays.toString(b));
		System.out.println(b.length);
	}

}
