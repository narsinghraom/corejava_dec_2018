
public class StringOperations {
	public static void main(String[] args) {
		int x = 0;
		String b = "qwertyy";
		char[] ch = new char[b.length()];
		for (int i = 0; i <= b.length() - 1; i++) {
			ch[i] = b.charAt(i);
		}
		for (int i = 0; i <= b.length() - 1; i++) {
			for (int j = i + 1; j <= b.length() - 1; j++) {
				if (ch[i] == ch[j]) {
					int r = ++x;
					int y = (r + 1);
					System.out.println(ch[j]);
					System.out.print(y);
				}
			}

		}
	}
}