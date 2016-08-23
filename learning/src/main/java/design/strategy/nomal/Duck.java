package design.strategy.nomal;

public abstract class Duck {
	public void performFly() {
		System.out.println("I can fly!!!");
	}

	public void performQuack() {
		System.out.println("Quack!!!");
	}

	public void swim() {
		System.out.println("I'm swimming!!!");
	}

	public abstract void display();

	public Duck() {
	}
}
