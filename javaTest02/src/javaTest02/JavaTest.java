package javaTest02;

public class JavaTest {

	public static void main(String[] args) {
		
		String str = "プログラムの開始";
		
		
		System.out.println(str);
		
		int a[] = { 1, 1, 2, 3, 6,8 };
		int b[] ;
		
		for( int i=0 ; i < 6 ; i++ ){
			System.out.println("a  " + (i+1) +a[i]);
		}
		
		b = a ;
		
		
		for( int i=0 ; i < 6 ; i++ ){
			System.out.println("b  " + (i+1) +b[i]);
		}
		
		b[3]=100;
		
		for( int i=0 ; i < 6 ; i++ ){
			System.out.println("a  " + (i+1) +a[i]);
		}
		for( int i=0 ; i < 6 ; i++ ){
			System.out.println("b  " + (i+1) +b[i]);
		}
		
		
		}

}
