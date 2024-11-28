package stream_Api.sortedMethod;

public class ExceptionDemo1 {
	
	public void method1(String s) {
		System.out.println("Method with String1 args");
	}
	
//	public void method1(Object o) {
//		System.out.println("Method with Object args");
//	}
	
//	public void method1(int o) {
//		System.out.println("Method with int args");
//	}
	
	public void method1(Object o) {
		System.out.println("Method with Integer args");
	}
	
	public static void main(String[] args) {
		
		
		ExceptionDemo1 ob = new ExceptionDemo1();
		
		ob.method1(null);
		
		
		
	}

}
