//형변환 묵시적 명시적 나눗셈에서는 double 형변환 중요!!!

public class CastTest {
	public static void main(String[] args) {
		int a = 123456;
		short b = 3;
		b = (short)a;
		System.out.println(b);
		
		short c = 10;
		int d;
		d = c;
		System.out.println(c);
		
		int number1 = 10;
		int number2 = 3;
		double resultNumber1 = (double)number1 / (double)number2;
		double resultNumber2 = number1 / number2;
		System.out.println(resultNumber1);
		System.out.println(resultNumber2);
	}
}