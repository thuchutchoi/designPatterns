package design.strategy.interfaces;

public class RubberDuck extends Duck implements Quackable{

	@Override
	public void display() {
		System.out.println("i'm a real Rubber duck");
	}
	public void performQuack() {
		System.out.println("Squeak!!!");
	}
}
