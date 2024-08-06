package n1;

public class testing {

	public static void main(String[] args) {
		String s = "MALABARAN";
		System.out.println(s.length());
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}
	
}
