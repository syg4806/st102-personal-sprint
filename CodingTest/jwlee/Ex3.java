package homework4;

public class Ex3 {

	public static void main(String[] args) {
		String text1 = "eW";
		String text2 = "LOVE";
		String text3 = "C++"; 
		String text4 = "	programming.	";

		StringBuilder st = new StringBuilder(text1);
		
		System.out.println(st.reverse().append(" ").append(text2.toLowerCase()).append(" ").append(text3.replace("C++", "JAVA")).append(" ").toString().concat(text4.trim()));
	}
//ssss
}
