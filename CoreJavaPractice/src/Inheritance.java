import java.util.ArrayList;

public class Inheritance {

	public static void main(String[] args) {

		// create a base class student object using constructor 2 of this class
		Student st1 = new Student("STEVE STUDENT1", "Z859483", "MATH");
		st1.baseSayMessage(); // Buzz is a student, not a freshmen
		st1.method99(); // call base class version of method 99

		// subclass Freshment object 1
		Freshmen f1 = new Freshmen(); // create object f1,default constructor

		System.out.println("\nFRESH1 DEFAULT DORM IS---> " + f1.dorm);
		System.out.println("FRESH1 DEFAULT MAJOR IS--> " + f1.major);
		f1.city = "Chicago"; // fill in properties for freshmen ,which were
								// stolen from base class
		f1.name = "PHIL FRESHMEN1";
		f1.highSchool = "NAPERVILLE";
		f1.zNumber = "Z983435";
		f1.baseSayMessage(); // call base method that was inherited

		// subclass Freshmen object number 2 using constructor 2
		Freshmen f2 = new Freshmen("SALLY FRESHMEN2", "Z12345", "CSCI", "New Hall", "SYCAMORE HS");

		System.out.println("\n FRESH2 DORM IS---> " + f2.dorm);
		System.out.println(" FRESH2 MAJOR IS--> " + f2.major);
		f2.baseSayMessage(); // call base method that was inherited
		f2.method99(); // call sub class method 99 that overrides base class
						// method

		// subclass Freshmen object number 3
		Freshmen f3 = new Freshmen("FRED FRESHMEN3", "Z9945", "CSCI", "Gilbert Hall", "ELGIN HS");

		// casting between base and sub classes
		Student st3 = (Student) f3; // cast up to "Student" for this
									// freshmen..look at intellisense
									// *have two pointers at the object now,one
									// at freshm,other
									// at student

		Object o3 = (Object) st3; // cast up to object from student

		generalMethod1(o3); // calling a method below that has type Object as a
							// parameter

		// review arraylists again
		ArrayList<Student> studentArrayList1 = new ArrayList<>();

		studentArrayList1.add(st1); // add a student to list, implicit cast up
									// to type object
		studentArrayList1.add(f1); // add a freshmen, implicit cast up to type
									// object

		Student mySt = (Student) studentArrayList1.get(0);// cast down to get
															// functionality
		Freshmen myFr = (Freshmen) studentArrayList1.get(1);// cast down to get
															// functionality

	}// end main

	// "cast up to meet type requirements-cast down to get functionality"
	static void generalMethod1(Object inObj) {
		// remember: there is no movement of the object when a method is called
		// java creates a pointer to be at the "type" as specified in the
		// signature
		// above, the pointer will be at the top of the structure -type object
		// implicit "cast up"
		// this signature means anything that has a type "object" can be used

		// getclass() gives you the lowest object that exists in the structure
		System.out.println("\n*This is the getclass()-->" + inObj.getClass().toString());

		// instanceof checks to see what "code/real estate" exists in the
		// object/structure
		if (inObj instanceof Object) {
			System.out.println("\n---This structure is instance of Object");
		}
		if (inObj instanceof Student) {
			System.out.println("\n---This structure is instance of Student");
			Student st4 = (Student) inObj; // cast to student
			System.out.println("\n---Student name " + st4.name);
		} // print student name

		if (inObj instanceof Freshmen) {
			System.out.println("\n---This structure is instance of Freshmen");
			Freshmen f4 = (Freshmen) inObj; // cast to freshmen
			f4.freshmenSpecialMethod();
		} // call special freshmen method

	}

} // end class inheritance
