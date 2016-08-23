package design.strategy.nomal;

public class TestMain {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		mallard.swim();
		//----------------------
		Duck redhead = new RedheadDuck();
		redhead.display();
		redhead.performFly();
		redhead.performQuack();
		redhead.swim();
		//-----------------------
		Duck rubber = new RubberDuck();
		rubber.display();
		rubber.performFly();
		rubber.performQuack();
		rubber.swim();
		//-----------------------
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.performQuack();
		model.swim();
	}
	//han che la co nhieu lop con ghi de nhung ko lam gi--->de no la abstract o lop cha(ko hay)--
	//van phai hien thuc code,code tao ra nhung ko co y nghia gi
	//cach giai quyet la remove nhung ham hay thay doi o lop cha cua no ra va tao lop interface tuong ung voi hanh vi do
	//cac lop con muon hien thuc ham nao thi implement interface do
}
