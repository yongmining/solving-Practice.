package chap02_solving_practice_test;

public class test2 {

	public static void main(String[] args) {
		
		/* 전위 후위 계산 */
		
		int a = 7; 					// a=7
		int b = a-- + 6;			// b=7+6=13, a=6
		int c = a++ + ++b;			// b=14, c=14+6=20, a=7
		int d = c-- - a-- + (b--);	// d=20-7+14=27, c=19, a=6, b=13
		int f = d-- + c++ + d; 		// f=27+19+26=72 d=26, c=20

		System.out.println("a =" + a);
		System.out.println("b =" + b);
		System.out.println("c =" + c);
		System.out.println("d =" + d);
		System.out.println("f =" + f);

	}

}
