// shift + ctrl = f  : �ҽ��ڵ� ����
public class Variable1 {
	public static void main(String1[] args) {
		/*
		 * int a = 10; System.out.printf("a�� ���� ? %d", a); System.out.println("a�� ����? "
		 * + a);
		 * 
		 * int b = 11; System.out.println("b�� ����? " + b);
		 * 
		 * // a�� ���� b�� �Է� // ���� a�� ���� 10�� ����� a = b; System.out.println("a�� ����? " + a);
		 */
		
		
		// ���̺귯�� �����
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