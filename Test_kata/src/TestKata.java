import java.util.Scanner;

public class TestKata {

	@SuppressWarnings("resource")
	public static void main(String[] args) {	
		System.out.println("Bienvenue dans le test kata. Pour quitter le programme, appuyez sur la touche X puis 'Entrer'.");
		boolean first_entrance = true;
		// Tant que l'utilisateur n'a pas quitt� le programme
		while (true) {
			// Si il y avait des valeurs dans l'ex�cution du programme
			if (args.length > 0 && first_entrance) {
				System.out.println("Nous allons effectuer les calculs sur les arguments mis en param�tres du main...");
				ShowResults(args);
				// Passage de la variable � non, auquel cas boucle infinie car il ya des param�tres en entr�e
				first_entrance = false;
			}
			// Si pas de param�tres en entr�e ou apr�s passage des param�tres pass�s dans le main
			else {
				Scanner inputReader = new Scanner(System.in);
				System.out.println("Merci de saisir un (ou plusieurs nombres espac�s) et d'appuyer sur 'Entrer' afin de lancer la proc�dure de calcul.");
				String input = inputReader.nextLine();
				ShowResults(input.split(" "));
			}
			System.out.println("---------------------------");
		}
	}
	
	@SuppressWarnings("resource")
	public static void ShowResults (String[] values) {
		System.out.println("Le(s) r�sultat(s) est / sont : ");
		for (int i = 0; i < values.length; i++) {
			try {
				int value = Integer.parseInt( values[i] );
				// Modulo 15
				if (value % 15 == 0) {
					System.out.println("fizzbuzz");
				}
				// Modulo 5
				else if (value % 5 == 0) {
					System.out.println("buzz");
				}
				// Modulo 3
				else if (value % 3 == 0) {
					System.out.println("fizz");
				}
				// Valeur tap�e
				else {
					System.out.println(value);
				}
			}
			catch (Exception e) {
				// Sortie du programme
				if (values[i].equalsIgnoreCase("X")) {
					Scanner inputReader = new Scanner(System.in);
					System.out.println("Le programme va maintenant s'arr�ter. Appuyez sur 'Entrer' pour sortir du programme...");
					inputReader.nextLine();
					System.exit(0);
				}
				// Retour si il n'y a pas que des chiffres dans la valeur
				else {
					System.out.println("Merci d'entrer uniquement des chiffres");
				}
			}
		}
	}

}
