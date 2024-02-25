package Oops;

public class ExtendsImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		fatherS S=new fatherS("Savliram", "Hadole", "Navnath");
		S.CityName();
		S.displayGname();
		
	}

}

interface cityname{
	public void CityName();
}


class Grandfather{

	String Gname;
	String lastname;
	
	public  Grandfather(String gn,String ln) {
		this.Gname=gn;
		this.lastname=ln;
	}
	public void displayGname(){
		System.out.println(this.Gname+ " " +this.lastname);
	}
}


class fatherS extends Grandfather implements cityname{

	String fname;
	public fatherS(String gn, String ln,String fn) {
		super(gn, ln);
		this.fname=fn;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void CityName() {
		// TODO Auto-generated method stub
		System.out.println("Mumbai");
	}
	
}
