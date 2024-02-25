package Oops;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat lilly = new Cat();
		lilly.Sound();
		lilly.type();
		lilly.city();

		reatangleA S = new reatangleA();
		S.Area(12, 34);
	}

}

interface Animals {

	abstract public void Sound();

	public abstract void type();

	public abstract void city();
}

class Cat implements Animals {

	@Override
	public void Sound() {
		// TODO Auto-generated method stub
		System.out.println("mew mew");
	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
		System.out.println("Pet Animal");
	}

	@Override
	public void city() {
		// TODO Auto-generated method stub
		System.out.println("Pune");
	}

}

// program 2

interface reatangle {
	public void Area(int height, int breath);
}

class reatangleA implements reatangle {
	@Override
	public void Area(int height, int breath) {
		// TODO Auto-generated method stub
		System.out.println(height * breath);
	}
}