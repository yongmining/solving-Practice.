package chap02_solving_practice_test;

public class test {

	public static void main(String[] args) {
		/* 연습 문제 */
		/* 용민이가 연예인이 되고싶어서 장동건의 프로필을 확인을 해보고 비교해보았다.
		 * 키와 얼굴이 생긴게 맞는지 비교해보았다. 
		 * 예시 키가 맞는지 비교 : fasle
		 * 생긴것이 같지 않는지 비교: true 
		*용민이의 키는160.3 장동건은180.5*/
		
		double yongki = 160.3;
		boolean yongface = false;
		
		double dongki = 180.5;
		boolean dongface = true;
		
		System.out.println("키가 똑같나요? : " + (yongki == dongki));
		System.out.println("똑같이 생겼나요? : " + !(yongface == dongface));

	}

}
