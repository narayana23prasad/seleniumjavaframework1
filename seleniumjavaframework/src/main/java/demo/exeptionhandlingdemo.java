package demo;

public class exeptionhandlingdemo {

	public static void main(String[] args) {
		
		
		try {
			System.out.println("Hello world");
			int i =1/0;
			System.out.println("completed");
		}
		
		catch(Exception exp) {
			
			System.out.println("inside catch block");
			System.out.println("message: "+exp.getMessage());
			System.out.println("cause: "+exp.getCause());
			exp.printStackTrace();
		}
		
		finally {
			System.out.println("inside finally block");
		}
	}
	
	
}
