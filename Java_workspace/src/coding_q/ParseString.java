package coding_q;
import java.util.Scanner;

public class ParseString {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter String to add");
			String st=scn.nextLine();
			int sum=0;
			int n=st.length();
			for (int i=0;i<n;i++) {
				char ch=st.charAt(i);
				if(ch>='0' && ch<='9') {
					sum=sum+Integer.parseInt(""+ch);
				}
			}
			System.out.println(" addition is: "+sum);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}