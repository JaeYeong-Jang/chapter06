package echo.ex05;

public class MultiThread {

	public static void main(String[] args) {

		Thread thread01 = new Thread(new DigitImpl());
		Thread thread02 = new Thread(new LowerImpl());
		Thread thread03 = new Thread(new UpperImpl()); // --> 세개의 인스턴스 모두 Runnable 을 인스턴스로 갖는다.

		thread01.start();
		thread02.start();
		thread03.start(); // --> 순차적으로 실행되지않고 자기 할 일 한다.
		
	}

}
