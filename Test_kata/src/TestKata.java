import java.util.Scanner;

public class TestKata {

	@SuppressWarnings("resource")
	public static void main(String[] args) {	
		System.out.println("Bienvenue dans le test kata. Pour quitter le programme, appuyez sur la touche X puis 'Entrer'.");
		boolean first_entrance = true;
		while (true) {
			if (args.length > 0 && first_entrance) {
				System.out.println("Nous allons effectuer les calculs sur les arguments mis en paramètres du main...");
				ShowResults(args);
				first_entrance = false;
			}
			else {
				Scanner inputReader = new Scanner(System.in);
				System.out.println("Merci de saisir un (ou plusieurs nombres espacés) et d'appuyer sur 'Entrer' afin de lancer la procédure de calcul.");
				String input = inputReader.nextLine();
				ShowResults(input.split(" "));
			}
			System.out.println("---------------------------");
		}
	}
	
	@SuppressWarnings("resource")
	public static void ShowResults (String[] values) {
		System.out.println("Le(s) résultat(s) est / sont : ");
		for (int i = 0; i < values.length; i++) {
			try {
				int value = Integer.parseInt( values[i] );
				if (value % 15 == 0) {
					System.out.println("fizzbuzz");
				}
				else if (value % 5 == 0) {
					System.out.println("buzz");
				}
				else if (value % 3 == 0) {
					System.out.println("fizz");
				}
				else {
					System.out.println(value);
				}
			}
			catch (Exception e) {
				if (values[i].equalsIgnoreCase("X")) {
					Scanner inputReader = new Scanner(System.in);
					System.out.println("Le programme va maintenant s'arrêter. Appuyez sur 'Entrer' pour sortir du programme...");
					inputReader.nextLine();
					System.exit(0);
				}
				else {
					System.out.println("Merci d'entrer uniquement des chiffres");
				}
			}
		}
	}

}
