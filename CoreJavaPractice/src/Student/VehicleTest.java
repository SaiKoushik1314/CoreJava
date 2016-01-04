package Student;

public class VehicleTest {

	public static void main(String[] args) {

		Bike b1 = new Bike();
		b1.setName("Hero");
		b1.setPower("40");
		b1.setCompany("HeroCorp");
		b1.powe(10.0, 12.2);
		System.out.println("Inheriatnce is a prop where class acquires the properties of another class"+b1.getName()+b1.getPower()+b1.getCompany());
		
		Car c1 = new Car();
		c1.setName("I 10");
		c1.setCompany("Hyundai");
		c1.setPower("2000");
		System.out.println("Sub class is the class from which props of super class are derived"+c1.getName()+c1.getCompany()+c1.getPower());
	
	
	
	}

}
