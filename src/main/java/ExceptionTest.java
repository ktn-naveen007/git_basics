
public class ExceptionTest {

	public void divideByZero() {
		try {
			int a, b, c;
			a = 10;
			b = 0;
			c = a / b;
			System.out.println("c=" + c);
		} catch (Exception e) {
			System.out.println("exception message>>>>>>>>" + e.getMessage());
		} finally {
			System.out.println("**********finally method called********");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionTest t = new ExceptionTest();

		// t.divideByZero();

		System.out.println("*******after catching exception");

		for (int i = 0; i < 5; i++) {
			System.out.println("i==" + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("j==" + j);
				if (j == 3) {

					break;
				}
			}

		}
	}
}
