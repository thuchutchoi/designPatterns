package design.strategy.interfaces;

public class MallardDuck extends Duck implements Flyable,Quackable{

	@Override
	public void display() {
		System.out.println("i'm a real Mallard duck");
	}

	public void performFly() {
		System.out.println("I can fly!!!");
	}

	public void performQuack() {
		System.out.println("Quack!!!");		
	}
}
