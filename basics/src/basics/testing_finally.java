package basics;

public class testing_finally {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 1, result;
		try {
			result = a / (b - c); 

		}

		catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally we done it ");
		}
		System.out.println("its ok..");
	}
	
}
