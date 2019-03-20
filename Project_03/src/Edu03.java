// 산술 -> 비교 -> 논리 연산자순으로 실행 but 가독성을 위해 ( ) 사용

public class Edu03 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		boolean c;
		boolean d;
		
		c = a != b;
		System.out.println(c);
		
		d = (a != b) && (a < b);
		System.out.println(d);
		
		
		int x = 1;
		int y = 0;
		
		// else if 잘못사용된 예
		if (x > y) {
			System.out.println("case1");
		} else if (x == 1) {
			System.out.println("case2"); // if조건에 해당되므로 이 조건은 잘못 설정됨
		} else {
			System.out.println("case3");
		}
			
	}
}
