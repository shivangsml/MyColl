package Testing;

public class Calculator {
	
	int a;
	
	int b;
	
	public Calculator(int a, int b) {
		
		this.a= a;
		
		this.b=b;
	}
	
	/*public Calculator( String a, String b) {
		this.a= a;
		
		
	}*/
	
	
	public int getA() {
		return this.a;
	}
	
	public void getB() {
		//return this.b;
		getC("default");
	}
	
	public Object add() {
		
		int c= a+b;
		return c;
		
	}
	public void getC(String str){
		
	}
	
	public static void main(String[] args) {
		
	}

}
