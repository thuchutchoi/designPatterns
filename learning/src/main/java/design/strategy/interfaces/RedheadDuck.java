package design.strategy.interfaces;

public class RedheadDuck extends Duck implements Flyable,Quackable{

	@Override
	public void display() {
		System.out.println("i'm a real Redhead duck");
	}

	public void performQuack() {
		System.out.println("I can fly!!!");
		
	}

	public void performFly() {
		System.out.println("Quack!!!");	
		
	}

}
