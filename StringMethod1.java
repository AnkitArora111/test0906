package junePractice;

public class StringMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Text = "  Hello Java  ";
		String Text1 = "  Hello Java  ";

		String Trimmedtext = Text.trim();
		boolean Equalstext1 = Text.equals(Text1);

		System.out.println(Trimmedtext);
		
		System.out.println(Equalstext1);
		System.out.println(Text.equalsIgnoreCase(Text1));
		
		
		

	}

}
