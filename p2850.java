import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2850 {
	public static void main(String[] args) {
	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		try {
			while((str=input.readLine())!=null && str.length()!=0) {
			    if ("esquerda".equals(str))
			        System.out.println("ingles");
			    else if ("direita".equals(str))
			    	System.out.println("frances");
			    else if ("nenhuma".equals(str))
			    	System.out.println("portugues");
			    else if ("as duas".equals(str))
			    	System.out.println("caiu");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
