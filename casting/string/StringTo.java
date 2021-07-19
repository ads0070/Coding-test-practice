package string;

public class StringTo {
	
	public int convert_StringToInteger(String str) {
		int num = Integer.parseInt(str);
		
		return num;
	}
	
	public String[] convert_StringToStringArray(String str) {
		String[] str_arr = str.split("");
		
		return str_arr;
	}
	
	public char[] convert_StringToCharArray(String str) {
		char[] char_arr = {};
		
		char_arr = str.toCharArray();
		
		return char_arr;
	}
	
	
}