import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		for (int i = 0; i < 20; i++) {
			h1.add(i % 2);

		}
		System.out.println(h1);
		Iterator itr = h1.iterator();
		// to print the sum of numbers
		double sum = 0;
		while (itr.hasNext()) {
			sum += (Integer) itr.next();
		}
		System.out.println(sum);
	}

}
