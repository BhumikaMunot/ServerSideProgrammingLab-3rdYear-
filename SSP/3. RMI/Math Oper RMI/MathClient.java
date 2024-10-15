

import java.rmi.Naming;

public class MathClient {
	public static void main(String[]args) {
		int a = 5, b = 23, c;
		try {
			Math m1 = (Math)Naming.lookup("rmi://localhost:1900"+"/jnec");
			c = m1.add(a, b);
			System.out.println("Addition of "+a+" and "+b+" :"+c);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
