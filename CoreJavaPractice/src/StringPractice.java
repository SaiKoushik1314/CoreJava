
public class StringPractice {

	public static void main(String[] args) {

		String name1 = "sai";
		String professor = "JIM";
		String middlename = "koushik";
		String lastname = "Ch";
		
		//int a = name1.length();
		System.out.println(name1.length());
		System.out.println(name1.concat(middlename)+","+lastname);
		changestring1(professor);
		System.out.println(name1.toUpperCase());
		System.out.println(middlename.substring(0,7));
		System.out.println(middlename.indexOf("sh",1));
		int b1 = name1.compareTo("ias");
		System.out.println(b1);
		boolean b = name1.equals("i");
		boolean b2 = name1.contains("s");
		System.out.println(b+" "+b2);
		
		String fan ="Sharukh Khan";
		if (fan.charAt(0) == 'S') {
			System.out.println("\nfirst char is M");
		}
		if(fan.contains("har")){
			System.out.println("yes");
			
		}
		StringBuilder st1 = new StringBuilder();
		
		st1.append("Power Star");
		st1.insert(10, "Pawan Kalyan");
		System.out.println(st1);
		
	}
	
	static void changestring1(String instring){
		instring = instring + " power";
		System.out.println("Name is: "+instring);
		
		
	}

}
