class Demo1{
	public void trycatch() {
		try {
			int result = 100/0;
		}
		catch(ArithmeticException a)
		{
			System.out.println("Denominator must be greater than Zero");
		}
	}
}

class Demo2{
	public void finaly() {
		try {
			int result = 100/0;
		}
		catch(ArithmeticException a)
		{
			System.out.println("Denominator must be greater than Zero");
		}
		finally {
			System.out.println("This is finally Block");
		}
	}
}

class Demo3{
	public void tryfinally() {
		try {
			int result = 100/0;
		}
		finally {
			System.out.println("This is finally Block");
		}
	}
}







public class Example1 {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.trycatch();
		
		System.out.println("-------------------------");
		
		Demo2 d2 = new Demo2();
		d2.finaly();
		
		System.out.println("-------------------------");
		
		Demo3 d3 = new Demo3();
		d3.tryfinally();
		
	}

}
