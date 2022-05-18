package secondmay;
enum Color2{
	Red,
	Green;
	
	private Color2() {
		System.out.println("Constructor called "+ this.toString());
	}
	
	public void display() {
		System.out.println("displaying...");
	}
}
public class testConst {

	public static void main(String[] args) {		// TODO Auto-generated method stub
		Color2 c = Color2.Green;
		c.display();
		System.out.println(c);
		
	}

}
