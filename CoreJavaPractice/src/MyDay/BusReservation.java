package MyDay;

public class BusReservation implements ReserveCheck {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setFN("Sai");
		c1.setDOB("January13th");
		c1.setGender("male");
		c1.setEducate("Masters");
		System.out.println("First Name is:"+c1.getFN());
		System.out.println("Last Name is:"+c1.getLN());
		System.out.println("Gender is:"+c1.getGender());
	}

	@Override
	public int reserve(int seats) {

		seats = 4;
		seats += seats * 3;
		return seats;
	}

}
