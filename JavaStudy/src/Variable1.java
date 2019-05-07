// shift + ctrl = f  : 소스코드 정렬
public class Variable1 {
	public static void main(String1[] args) {
		/*
		 * int a = 10; System.out.printf("a의 값은 ? %d", a); System.out.println("a의 값은? "
		 * + a);
		 * 
		 * int b = 11; System.out.println("b의 값은? " + b);
		 * 
		 * // a의 값에 b를 입력 // 기존 a의 값읶 10은 사라짐 a = b; System.out.println("a의 값은? " + a);
		 */
		
		
		// 라이브러리 사용방법
		// 0.0 <= x < 1.0
		double r = Math.random() * 6;  // 0.0 ~ 5.999999  
		r = r + 1;
		int num = (int) r;
		System.out.println("num"+num);
		
		int num2 = (int) (Math.random()*6 + 1);
		System.out.println("num2"+num2);
		// Unix Time
		long ut = System.currentTimeMillis();
		System.out.println(ut);
	}
}