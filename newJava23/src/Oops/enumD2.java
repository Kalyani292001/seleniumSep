package Oops;
enum SizeP {
	
	SMALL,MEDIUM,LARGE,EXTRALARGE;
}

public class enumD2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test aa = new Test(SizeP.EXTRALARGE); // SMALL
		aa.orderPizza();
	}
}


class Test {
	SizeP pizzaSize;
	public Test(SizeP p) {
		this.pizzaSize  = p;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL :
			System.out.println("i order small pizza");
			break;
		case MEDIUM:
			System.out.println("i order Medium pizza");
			break;
		case LARGE:
			System.out.println("i order Large pizza");
			break;
		case EXTRALARGE:
			System.out.println("i order  Extra Large pizza");
			break;
		default:
			System.out.println("I am of default type M");

		}
	}
}
	
