// s23024
// ->」演算子を使ったコードを書く

public class d51Q26kadai {
	public static void main(String[] args) {
		int n = 1;
		String s = "";
		switch (n) {
			case 1 -> s += "one";
			case 2 -> s += "two";
			default -> s += "?";
		}
		System.out.println(s);
	}
}
