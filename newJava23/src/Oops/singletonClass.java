package Oops;

public class singletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataBase d=DataBase.objCreate();
		d.getConnection();
	}

}

class DataBase{
	
	public static DataBase obj;
	
	private DataBase() {
		
	}
	
	
	public static DataBase objCreate(){
		if(obj==null) {
			obj=new DataBase();
		}
		
		return obj;
	}
	
	public  void getConnection() {
		System.out.println("connected to DB");
	}

		
	} 
