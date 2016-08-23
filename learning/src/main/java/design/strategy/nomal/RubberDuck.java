package design.strategy.nomal;

public class RubberDuck extends Duck{

	@Override
	public void display() {
		System.out.println("i'm a real Rubber duck");
	}
	public void performQuack() {
		System.out.println("Squeak!!!");
	}
	@Override
	public void performFly() {
		//khong lam gi
	}
}
