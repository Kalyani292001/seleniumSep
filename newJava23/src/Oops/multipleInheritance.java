package Oops;

public class multipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		rule r=new rule();
		r.RuleA();
		r.RuleB();
		r.RuleC();
		r.RuleD();
		r.RuleE();
		r.RuleF();
		r.RuleG();
		r.RuleH();
		r.RuleI();
		r.RuleJ();
	}

}


interface A{
	
	public void RuleA();
	public void RuleB();
	public void RuleC();
	public void RuleD();
	public void RuleE();
	
}

interface B{
	public void RuleF();
	public void RuleG();
	public void RuleH();
	public void RuleI();
	public void RuleJ();
	
}

class rule implements A,B{
	@Override
	public void RuleF() {
		// TODO Auto-generated method stub
		System.out.println("RuleF");
	}

	@Override
	public void RuleG() {
		// TODO Auto-generated method stub
		System.out.println("RuleG");
	}

	@Override
	public void RuleH() {
		// TODO Auto-generated method stub
		System.out.println("RuleH");
	}

	@Override
	public void RuleI() {
		// TODO Auto-generated method stub
		System.out.println("RuleI");
	}

	@Override
	public void RuleJ() {
		// TODO Auto-generated method stub
		System.out.println("RuleJ");
	}

	@Override
	public void RuleA() {
		// TODO Auto-generated method stub
		System.out.println("RuleA");
	}

	@Override
	public void RuleB() {
		// TODO Auto-generated method stub
		System.out.println("RuleB");
	}

	@Override
	public void RuleC() {
		// TODO Auto-generated method stub
		System.out.println("RuleC");
	}

	@Override
	public void RuleD() {
		// TODO Auto-generated method stub
		System.out.println("RuleD");
	}

	@Override
	public void RuleE() {
		// TODO Auto-generated method stub
		System.out.println("RuleE");
	}
}