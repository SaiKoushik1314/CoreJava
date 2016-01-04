public class Student {

	public String name; // "public" access means any class in world can access

	String zNumber; // default access is called "package" access to classes
	String city; // only in this package

	protected String major; // protected means this is accessable to any class
							// in package and any subclass (that extends from
							// it)

	private int gpa; // private only code in this class can access

	public Student() {
	}; // default constructor 1 for base class//default constructor 1 for base
		// class
	// constructor 2 for base class,3 parms expected

	public Student(String inname, String inznumber, String inmajor) {
		this.name = inname;
		this.zNumber = inznumber;
		this.major = inmajor;
	}// end constructor

	// method of base class
	public void baseSayMessage() {
		System.out.println("  baseSayMessage welcomes to NIU this student-> " + name);
	};

	// another method in base class
	public void method99() {
		System.out.println("  This is base class method 99 output ");
	};

}
