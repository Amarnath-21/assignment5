package week2day1;

public class ReverseString {
public static void main(String [] args) {
	String name="Amarnath";
	String uppercase=name.toUpperCase();
	
	char[] nameArray=uppercase.toCharArray();
	for(int i= nameArray .length-1;i>=0;i--) {
		System.out.println(nameArray[i]);
	}
}
}
