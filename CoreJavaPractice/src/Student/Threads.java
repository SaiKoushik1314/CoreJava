package Student;

public class Threads implements Runnable {

	@Override
	public void run() {
System.out.println("Hy from Threads");
	}

	public static void main(String[] args) throws Throwable {

		Thread t1 = new Thread();
		t1.start();
		for(int i=0;i<4;i++){
//			i=i+2;
			System.out.println("The value of i:"+i);
			//t1.sleep(1);
			Thread t2 = new Thread();
			//t2.start();
			//t2.sleep(1);
			System.out.println("Hello from T2");
		}
		Thread t2 = new Thread();
		t2.start();
		System.out.println("Hello from T2");
	}

}
