
import java.util.Scanner;

public class p1168 {
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String str = new String("");
		int N = scanner.nextInt();
		for (int i = 0; i < N; i++) {			
			int led = 0;
			if (scanner.hasNextLine()) {
				str = scanner.next();
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == '1')
							led += 2;
						else if (str.charAt(j) == '2' || str.charAt(j) == '3' || str.charAt(j) == '5')
							led += 5;
						else if (str.charAt(j) == '4')
							led += 4;
						else if (str.charAt(j) == '6' || str.charAt(j) == '9' || str.charAt(j) == '0')
							led += 6;
						else if (str.charAt(j) == '7')
							led += 3;
						else if (str.charAt(j) == '8')
							led += 7;						
				}
				System.out.println(led + " leds");
			}
		}		
		scanner.close();
	}
}
