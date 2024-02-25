package Oops;

enum DAY{
	SUN,MON,TUES,WED,THUR,FRI,SAT;
}
public class enumD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 d=new Test1(DAY.FRI);
		d.displayDaysname();
		Test1 d1=new Test1(DAY.MON);
		d1.displayDaysname();
		Test1 d2=new Test1(DAY.SUN);
		d2.displayDaysname();
		Test1 d3=new Test1(DAY.TUES);
		d3.displayDaysname();
		
	}

}


class Test1{
	
	DAY day;
	public Test1(DAY day) {
		this.day=day;	
	}
	
	public void displayDaysname(){
		switch(day) {
		case SUN:
			System.out.println("Sunday");
			break;
		case MON:
			System.out.println("Monday");
			break;
		case TUES:
			System.out.println("Tuesday");
			break;
		case WED:
			System.out.println("Wednesday");
			break;
		case THUR:
			System.out.println("Thursday");
			break;
		case FRI:
			System.out.println("Friday");
			break;
		case SAT:
			System.out.println("Saturday");
			break;
			
		default:
			System.out.println("you enter wrong days");
		}
	}
}