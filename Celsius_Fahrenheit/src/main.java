import java.util.Objects;
import java.util.Scanner;
public class main {

	private static Scanner sc1;

	public static void main (String[] args) {

		sc1 = new Scanner(System.in);

		System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
		System.out.println("-------------------------------------------------");

		String restart = "O";

		while (Objects.equals(restart, "O") || Objects.equals(restart, "o")) {

			System.out.println("Choisissez le mode de conversion :");
			System.out.println("1 - Convertisseur Celsius - Fahreinheit");
			System.out.print("2 - Convertisseur Fahreinheit - Celsius");

			int choice = sc1.nextInt();

			switch(choice) {

			case 1:
				System.out.println("Temp�rature � convertir :");
				float celsius = sc1.nextFloat();
				float repCelsius = (celsius * 9/5) + 32;	
				System.out.println(celsius + " �C correspond � : " + repCelsius + " �F.");
				System.out.println("Souhaitez-vous convertir une autre temp�rature ?(O/N)");
				restart = sc1.next();
				if (Objects.equals(restart, "O") || Objects.equals(restart, "o")) {
					break;
				} else {
					System.out.println("Au revoir !");
					System.exit(0);
				}

			case 2:
				System.out.println("Temp�rature � convertir :");
				float fahreinheit = sc1.nextFloat();
				float repFahreinheit = ((fahreinheit - 32) * 5) / 9;
				System.out.println(fahreinheit + " �F correspond � : " + repFahreinheit + " �C.");
				System.out.println("Souhaitez-vous convertir une autre temp�rature ?(O/N)");
				restart = sc1.next();
				if (Objects.equals(restart, "O") || Objects.equals(restart, "o")) {
					break;
				} else {
					System.out.println("Au revoir !");
					System.exit(0);
				}

			default :
				System.out.println("Veillez recommencer la saisie.");
				break;
			}

		}
	}
}