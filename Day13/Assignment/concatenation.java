
public class concatenation {
	public static void main(String[] args) {
		
		String str1 = "Mark";
		String str2 = "Kate";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		
		if (str1.charAt(str1.length() - 1) == str2.charAt(1)) {
			sb.append(str2.substring(1, str2.length()));
		} else {
			sb.append(str2);
		}
		
		System.out.println(sb);				
		sb.append(str1);
		
	}

}
