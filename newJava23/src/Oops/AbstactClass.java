package Oops;



public class AbstactClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI s=new SBI();
		s.branchName();
		s.loan();
		s.save();
		
		Baroda b=new Baroda();
		b.loan();
		b.save();
	}
}
abstract class worldBank{
	 
	 public abstract void save();
	 public abstract void loan();
	 
}



class SBI extends worldBank{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("save from worldBank");
		
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("loan from worldBank");
		
	}
	 
	public void branchName() {
		System.out.println("it's Vaijapur Branch");
	}
}


class Baroda extends worldBank{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("loan from worldBank1");
		
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("save from worldBank1");
		
	}
	
}
