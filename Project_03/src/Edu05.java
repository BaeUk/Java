// 무한루프 보다는 큰수 넣어서 돌려보기 for문 중간에 i = 10;값 변경 X int test = i; test = 10; 처럼 새로운 변수 선언해서 사용
// continue 조건이 성립하면 처음으로 돌림?? for문에서 확인해보기

public class Edu05 {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			System.out.print(i + "\t");
			for(int j = 0; j < 3; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		int a = 0;
		while (true) {
			System.out.println(a);
			a++;
			if ( a > 1000) {
				break;
			}
		}
	}
}
