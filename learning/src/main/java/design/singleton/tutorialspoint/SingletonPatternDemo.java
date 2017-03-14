package design.singleton.tutorialspoint;

public class SingletonPatternDemo {
    public static void main(String[] args) {

	// illegal construct
	// Compile Time Error: The constructor SingleObject() is not visible
	// SingleObject object = new SingleObject();

	// Get the only object available
	final SingleObject object = SingleObject.getInstance();

	// show the message
	object.showMessage();
	final Elvis elvis = Elvis.INSTANCE;
	elvis.showMessage();
    }
}
