import java.io.*;
import java.util.*;

public class CopyFromFileaToFileb {
	
	public static void copyContent(File a, File b)
		throws Exception
	{
		FileInputStream in = new FileInputStream(a);
		FileOutputStream out = new FileOutputStream(b);

		try {

			int n;

		
			while ((n = in.read()) != -1) {
			
				out.write(n);
			}
		}
		finally {
			if (in != null) {

				
				in.close();
			}
			
			if (out != null) {
				out.close();
			}
		}
		System.out.println("File Copied");
	}

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
            
		
		System.out.println(
			"C:\\Users\\HP\\Desktop\\COPY\\File a");
		String a = sc.nextLine();


		File x = new File(a);

	
		System.out.println(
			"C:\\Users\\HP\\Desktop\\COPY\\File b");
		String b = sc.nextLine();

		
		File y = new File(b);

	

		copyContent(x, y);
	}
}