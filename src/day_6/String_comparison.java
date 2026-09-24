package day_6;

public class String_comparison {

	public static void main(String[] args) {
		//case sensitive
		String str1="hello";
		String str2="hello";
		String str3="Hello";
		
		boolean result1=str1.equals(str2);
		boolean result2=str1.equals(str3);
		
		System.out.println(result1);
		System.out.println(result2);
		//without case sensitive
		
		boolean result3=str1.equalsIgnoreCase(str3);
		System.out.println(result3);
		
		

	}

}
