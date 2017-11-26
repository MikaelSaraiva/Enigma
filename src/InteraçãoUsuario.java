import java.util.Scanner;

public class InteraçãoUsuario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Enigma frase = new Enigma();
		int input = -1;

		while (input != 0) {
			System.out.println("* * Bem vindo a essa porra * *");
			System.out.println("");
			System.out.println("Codificar ou decodificar? ");
			System.out.println("");
			System.out.println("(0)Sair dessa porra");
			System.out.println("(1)Codificar essa merda");
			System.out.println("(2)Decodificar essa merda");
			System.out.println("");
			System.out.print("Opção: ");

			input = entrada.nextInt();
			
			if (input == 1) {
				System.out.print("Diga a frase que deseja codificar: ");
				String n = entrada.next();

				String fim = frase.codificarFrase(n);

				System.out.println("Palavra codificada: " + fim);
				System.out.println("");


			}
			else if (input == 2) {
				System.out.print("Diga a frase que deseja decodificar: ");
				String m = entrada.next();

				String fim2 = frase.decodificarFrase(m);

				System.out.println("Palavra decodificada: " + fim2);
				System.out.println("");

				/*
				 * System.out.print("Diga a frase que deseja codificar: "); String n =
				 * entrada.next();
				 * 
				 * String fim = frase.codificarFrase(n);
				 * 
				 * System.out.println(fim);
				 */
			}
		}
		entrada.close();

	}
}
