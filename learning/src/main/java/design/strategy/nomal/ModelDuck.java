package design.strategy.nomal;

public class ModelDuck extends Duck{
	@Override
	public void display() {
		System.out.println("i'm a real Model duck");
	}
	@Override
	public void performFly() {
		//do nothing
	}
	@Override
	public void performQuack() {
		//do nothing
	}
}
