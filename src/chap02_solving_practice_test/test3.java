package chap02_solving_practice_test;

public class test3 {

	public static void main(String[] args) {
	
		/* 연습 문제
		 * 돈이 많은지 확인
		 * 
		 * 돈을 얼마나 가졌는지 변수에 저장하고,
		 * 삼항연산자를 사용해서
		 * 100000(십만원)보다 많으면 "돈이 많다."
		 * 1000(천원)보다 적으면 "돈이 적다."
		 * 그 외는 "적당히 있다." 를 출력
		 * 
		 * 출력 예)
		 * 나는 돈이 많다.
		 * 나는 돈이 적다.
		 * 나는 돈이 적당히 있다.
		 * 중 하나 출력
		 * 
		 */
		
		int havemoney= 30000;
		
		String result = (havemoney>=100000)?"돈이 많다.":(havemoney>=1000)?"적당히 있다!":"거지다";
		
		System.out.println("나는! 돈이! " +result);

		
		
	}

}
