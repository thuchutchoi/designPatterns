package design.strategy.interfaces;

public class TestMain {
	public static void main(String[] args) {
		//Duck mallard = new MallardDuck();//hc1
		MallardDuck mallard = new MallardDuck();//hc1
		mallard.display();
		mallard.performFly();//
		mallard.performQuack();//
		mallard.swim();
		//----------------------
		RedheadDuck redhead = new RedheadDuck();
		redhead.display();
		redhead.performFly();//
		redhead.performQuack();//
		redhead.swim();
		//-----------------------
		RubberDuck rubber = new RubberDuck();
		rubber.display();
		//rubber.performFly();//not implement 
		rubber.performQuack();
		rubber.swim();
		//-----------------------
		ModelDuck model = new ModelDuck();
		model.display();
		//model.performFly();//not implement
		//model.performQuack();//not implement
		model.swim();
	}
	//han che la khi muon thay doi hanh vi ta phai viet lai toan bo code.
	//vi vay ta co the set cac interface khac-->co thuoc tinh cua interface do---dua no len lop cha--lop cha cung chi dinh nghia phuong thuc
	//luu y rang interface dinh nghia mot phuong thuc trung ten va tham so voi abstract,thi no dung phuong thuc cua cha chu ko phai cua interface.
	//lop con khi implement lop nay thi ko can phai implememnt no
}
