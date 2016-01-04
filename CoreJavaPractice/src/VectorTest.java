import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		String vectordata[] = { "Sai", "koushik", "pawan", "nitesh" };
		Vector v = new Vector();
		for (int i = 0; i < vectordata.length; i++) {
			v.add(vectordata[i]);
		}
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.get(2));
		System.out.println(v.clone());
		System.out.println(v.indexOf("sai"));
	}

}
