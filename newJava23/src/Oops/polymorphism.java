package Oops;

public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// overLoading
		CalculatorA a=new CalculatorA();
		a.Addition(1, 2);
        a.Addition(1, 2,3);
        a.Addition(1, 2,4,3);
        
        // default constructor
//        PersonL B=new PersonL();
//       PersonL B1=new PersonL(1);
//       PersonL B11=new PersonL(1,2);
       
       // over riding
       
       DaughterOne1 Kalyani=new DaughterOne1 ("Kusum","Hadole","Kalyani");
       System.out.println(Kalyani.MName);
       System.out.println(Kalyani.lastName);
       System.out.println(Kalyani.DaughterOneName);
       
       Kalyani.displayDName();
       Kalyani.displayName();
       
	}

}


// overloading
// same class same method different signature

class CalculatorA{
	
	public void Addition(int x,int y) {
		System.out.println(x+y);
	}
	public void Addition(int x,int y , int z) {
		System.out.println(x+y+z);
	}
	public void Addition(int x,int y,int z , int e) {
		System.out.println(x+y+z+e);
	}
}


// Default constructor


class PersonL{
	public  PersonL(int x){
		System.out.println("default construtor with one parameter" + x);
	}

	public  PersonL(int x,int y) {
		System.out.println("default constructor with two parameter"+ (x+y));
	}
	
	public  PersonL() {
		System.out.println("default constructor");
	}
}


// over Riding

// same method same signature different class

class MotherG{	
	String MName;
	String lastName;
	
	public  MotherG(String Mn,String Ln) {
		this.MName=Mn;
		this.lastName=Ln;
	}
	public void displayName() {
		System.out.println(this.MName+this.lastName);
	}
}

class DaughterOne1 extends MotherG{
	String DaughterOneName;
	
	public DaughterOne1(String Mn,String Ln,String DOne) {
		super(Mn,Ln);
		this.DaughterOneName=DOne;
	}
	public void displayDName() {
		System.out.println(this.DaughterOneName+this.lastName);
	
	}

}
