package secondmay;
interface A1{
	public int add();
}

class A2 implements A1{
	@Override
	
	public int add() {
		
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		return c;
	}
}

class A3 extends A2{
	@Override
	public int add() {
		
		int a = 10, b =30, c = a+b;
		System.out.println(c);
		return c;
	}
}

public class PolyDynamicDemo {
	public static void main(String[] args) {
		A3 obj = new A2();
		obj.add();
	}
}
