package secondmay;
enum Names{
	Mohit,
	Mathur,
	ATCS,
	Infosys
}
public class TestEnum {
	Names name;
	public TestEnum(Names name) {
		super();
		this.name = name;
	}
	public void listnames() {
		switch(name) {
		case Mohit:
			System.out.println("First Name");
			break;
		case Mathur:
			System.out.println("Last Name");
			break;
		case ATCS:
			System.out.println("company name");
			break;
		default:
			System.out.println("Something else...");
			break;
		}
	}
	
	public static void main(String[] args) {
		String text = "Infosys";
		TestEnum t1 = new TestEnum(Names.valueOf(text));
		t1.listnames();
	}
	
}
