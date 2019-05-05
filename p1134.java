import java.util.Scanner;

public class p1134 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0;
		int opcao = scanner.nextInt();
		
		while (opcao != 4) {
			if (opcao == 1)
				alcool++;
			else if (opcao == 2)
				gasolina++;
			else if (opcao == 3)
				diesel++;
			opcao = scanner.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		scanner.close();
	}

}
