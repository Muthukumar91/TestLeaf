package Actions;

public class ReverseString {

	public static void main(String[] args) {
		
		String txt="AMAZON INDIA", reversetxt="";
		int length = txt.length();
		for (int i = length-1; i >=0 ; i--) {
			 
			reversetxt=reversetxt+txt.charAt(i);
			
		}
		System.out.println(reversetxt);
		
	StringBuffer buffer = new StringBuffer(txt);
	
	System.out.println(buffer.reverse());
	
StringBuilder builder = new StringBuilder(txt);
	
	System.out.println(builder.reverse());
	}

}
