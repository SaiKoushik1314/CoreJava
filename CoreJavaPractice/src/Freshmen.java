public class Freshmen extends Student {

	public String highSchool; // properties particular to a freshmen student
	public String dorm;

	// 2 constructors available
	public Freshmen() { // default constructor 1

		 // for the default case
	}

	public Freshmen(String inName, String inZnumber, String inMajor, String inDorm, String inHS) { // constructor
																									// 2
																									// with
																									// 4
																									// parms
																									// expected

		super(inName, inZnumber, inMajor); // call to super class constructor 
		                  
 this.dorm=inDorm;   //these are members of freshmen class 
 this.highSchool=inHS;
 }
 //@ subclass override of base class method 99 
@Override
  public void method99(){
    System.out.println("  This is sub class override method99 output ");  };
  
   public void freshmenSpecialMethod(){
    System.out.println("  This is the code in the special method only in a freshmen object ");  };
}

