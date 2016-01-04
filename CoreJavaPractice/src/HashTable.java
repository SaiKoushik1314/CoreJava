import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		Hashtable ht = new Hashtable();
		String st1 = new String("Sai");
		String st2 = "Sandeep";
		String st3 = "ganesh";
		ht.put(st1, new Double(1.0));
		ht.put(st2, new Double(2.0));
		ht.put(st3, new Double(3.0));
//		System.out.println(ht.get("sai"));
//		System.out.println(ht);
//		System.out.println(ht.containsKey(3));
		Enumeration e = ht.keys();
		Enumeration e2 = ht.elements();
//		System.out.println(e);
//		System.out.println(e2);
		while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				System.out.println("Key is:"+key + ht.get(key));
		}

	}

}
