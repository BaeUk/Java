// ��� -> �� -> �� �����ڼ����� ���� but �������� ���� ( ) ���

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
		
		// else if �߸����� ��
		if (x > y) {
			System.out.println("case1");
		} else if (x == 1) {
			System.out.println("case2"); // if���ǿ� �ش�ǹǷ� �� ������ �߸� ������
		} else {
			System.out.println("case3");
		}
			
	}
}
