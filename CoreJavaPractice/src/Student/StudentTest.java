package Student;

public class StudentTest implements SearchStudent {

	public static void main(String[] args) {
    Details d1 = new Details();
    d1.setFirstName("SaiKoushik");
	d1.setLastName("Chituluri");
	d1.setID("Z1745655");
	d1.setGPA(3.7);
	d1.setAddress("919 Ridge Drive #7-3 DeKalb IL");
		
	}

	@Override
	public String search() {
		// TODO Auto-generated method stub
		return null;
	}

}
