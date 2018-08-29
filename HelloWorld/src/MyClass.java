
public class MyClass 
{

	static String randomString = "hello world";
	
	static final double BUSHDID = 9.11;
	public static void main(String[] args) 
	{
		System.out.println(randomString);
		
		byte MAXbyte = 127;
		short MAXshort = 32767;
		int MAXint = 2100000000;
		long MAXlong = 922000000000000l;
		float HUGEfloat = 3.14F;
		double HUGEdouble = 3.148237948;
		
			System.out.println(Float.MAX_VALUE);
			System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		
		char randomChar = 69;
			System.out.println(randomChar);
			
			String yetAnotherString = "why have you forsaken me"; 
			String Combo = randomString + ' ' + yetAnotherString + " again";
			System.out.println(Combo);
			
			String byteString = Byte.toString(MAXbyte);
			
			double aDouble = 2.2525;
			int doubleToInt = (int) aDouble;
			System.out.println(doubleToInt);
			
			int stringToInt = Integer.parseInt(byteString);
			System.out.println(stringToInt);
			
			System.out.println(MAXint);
			
			
	}

}
