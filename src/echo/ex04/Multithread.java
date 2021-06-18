package echo.ex04;

public class Multithread {

	public static void main(String[] args)throws Exception {

		Thread thread = new Thread(new DigitRunnableImpl());

		thread.start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);

		}

	}

}
