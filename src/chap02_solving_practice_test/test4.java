package chap02_solving_practice_test;

public class test4 {

	public static void main(String[] args) {
		/* 당신의 이름은 각자 이름 이고, 나이는20세 이며, 성별은남입니다
		당신의 이름은 ?? 이고, 나이는20세 이며, 성별은여입니다
		위 내용을 출력 */
		
			
			test4 tes4 = new test4();
			tes4.Method("김용민", 24, '남');
			
			tes4.Method("이준성", 24, '여');

		}
		 

		public void Method(String name, int age, final char gender) {
			
			System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살 이며, 성별은 " + gender + "입니다.");
			
	}
}

