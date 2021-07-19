package string;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		StringTo st = new StringTo();
		String str_num = "38392";
		String str = "Hello";
		
		// String To Integer
		System.out.println("String : " + str_num + " | int : " + st.convert_StringToInteger(str_num));
		
		// String to StringArray
		System.out.println("String : " + str + " | StringArray : "+Arrays.toString(st.convert_StringToStringArray(str)));
		
		// String to CharArray
		System.out.println("String : " + str + " | charArray : "+Arrays.toString(st.convert_StringToCharArray(str)));
		
	}
}
