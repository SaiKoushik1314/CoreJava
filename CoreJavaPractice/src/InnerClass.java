
public class InnerClass {

	interface a {
		public void call();
	}

	class outerclass implements a {

		int a = 10, b = 5;

		public void println() {
			System.out.println("addition result" + add(a, b));
		}

		void display() {
			outerclass oc = new outerclass();
			oc.println();
		}

		@Override
		public void call() {
			System.out.println("Hy");
		}

	}

	class outerclass2 implements a {

		@Override
		public void call() {
			System.out.println("Hello");		
	}
	
}
	static class outerclass3 implements a{

		@Override
		public void call() {
			// TODO Auto-generated method stub
			System.out.println("Namasthe");
		}
		
	}
	public static void main(String[] args) {
		InnerClass.outerclass oi = new InnerClass().new outerclass();
		oi.call();
		oi.display();
		InnerClass.outerclass2 oi2 = new InnerClass().new outerclass2();
		oi2.call();
		InnerClass.outerclass3 oi3 = new outerclass3();
		oi3.call();
	}

	private static int add(int a, int b) {
		return a + b;
	}
}
