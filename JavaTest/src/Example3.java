class Overloading{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void add(int a,float b) {
		System.out.println(a+b);
	}
}


class Animal{
	
	public void sleep() {
		System.out.println("Animal can sleep");
	}	
}

class Dog extends Animal{
	
	@Override
	public void sleep() {
		System.out.println("Dog can sleep 7 hours");
	}	
}

class Cat extends Animal{
	
	@Override
	public void sleep() {
		System.out.println("Cat can sleep 10 hours");
	}	
}


public class Example3 {
	public static void main(String[] args) {
		Overloading method = new Overloading();
		method.add(10,40);
		method.add(30,50,20);
		method.add(30,7.3f);
		
		Animal a1 = new Dog();
		a1.sleep();
		Animal a2 = new Cat();
		a2.sleep();
		
	}

}
