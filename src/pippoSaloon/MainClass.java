package pippoSaloon;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AutomobileClass automobile1 = new AutomobileClass("Fiat", "Panda", 1200, 8);
		AutomobileClass automobile2 = new AutomobileClass("Ford", "Fiesta", 1500, 6);
		AutomobileClass automobile3= new AutomobileClass("Lamborghini", "Revuelto", 12000, 9);
		AutomobileClass automobile4 = new AutomobileClass("Range Rover", "Sport SE", 5000, 8);
		AutomobileClass automobile5 = new AutomobileClass("Fiat", "PANDINO", 100000, 10);
		ArrayList<AutomobileClass> automobili = new ArrayList<>();
		ArrayList<AutomobileClass> autoNoleggiate = new ArrayList<>();
		
		automobili.add(automobile1);
		automobili.add(automobile2);
		automobili.add(automobile3);
		automobili.add(automobile4);
		automobili.add(automobile4);
		
		System.out.println("Hai la patente? y o n");
		char controllo = scanner.next().charAt(0);
		if(controllo == 'n') {
			System.out.println("Purtroppo non noleggiamo biciclette con le rotelle.");
			return;
		}else if(controllo == 'y'){

			while(true) {
		
				System.out.println("╔═══════════════════════════════════════╗");
				System.out.println("║               _______                 ║");
				System.out.println("║             //  ||\\ \\                 ║");
				System.out.println("║         ___//___||_\\ \\___             ║");
				System.out.println("║        |  ____  ||__|___ | |          ║");
				System.out.println("║        |_|   /_|-|-|-/_||-|           ║");
				System.out.println("║           (_ _)_) (_ _|_)             ║");
				System.out.println("║                                       ║");
				System.out.println("║     Benvenuto nel Pippo's Saloon      ║");
				System.out.println("╠═══════════════════════════════════════╣");
				System.out.println("║1. Visualizza le auto noleggiabili.    ║");
				System.out.println("╠═══════════════════════════════════════╣");
				System.out.println("║2. Inserisci una nuova auto.           ║");
				System.out.println("╠═══════════════════════════════════════╣");
				System.out.println("║3. Noleggia un'auto.                   ║");
				System.out.println("╠═══════════════════════════════════════╣");
				System.out.println("║4. Restituisci un'auto.                ║");
				System.out.println("╠═══════════════════════════════════════╣");
				System.out.println("║5. Visualizza auto noleggiate.         ║");
				System.out.println("╠═══════════════════════════════════════╣");
				System.out.println("║0. Esci.                               ║");
				System.out.println("╚═══════════════════════════════════════╝");
			
				int scelta = scanner.nextInt();
			
				switch(scelta) {
					case 1: 
						System.out.println("╔═══════════════════════════════════════╗");
						System.out.println("║               _______                 ║");
						System.out.println("║             //  ||\\ \\                 ║");
						System.out.println("║         ___//___||_\\ \\___             ║");
						System.out.println("║        |  ____  ||__|___ | |          ║");
						System.out.println("║        |_|   /_|-|-|-/_||-|           ║");
						System.out.println("║           (_ _)_) (_ _|_)             ║");
						System.out.println("║                                       ║");
						System.out.println("║           Pippo's Saloon              ║");
						System.out.println("╚═══════════════════════════════════════╝\n");
	
						System.out.println("Alcune delle nostre automobili: ");
						for(AutomobileClass auto:automobili) {
							System.out.println(auto+"\n");
						}
					break;
					case 2:
						System.out.println("╔═══════════════════════════════════════╗");
						System.out.println("║               _______                 ║");
						System.out.println("║             //  ||\\ \\                 ║");
						System.out.println("║         ___//___||_\\ \\___             ║");
						System.out.println("║        |  ____  ||__|___ | |          ║");
						System.out.println("║        |_|   /_|-|-|-/_||-|           ║");
						System.out.println("║           (_ _)_) (_ _|_)             ║");
						System.out.println("║                                       ║");
						System.out.println("║           Pippo's Saloon              ║");
						System.out.println("╚═══════════════════════════════════════╝\n");
						
						System.out.print("Inserisci la cilindrata dell'auto che vuoi inserire: ");
						int cilindrataInserita = scanner.nextInt();
						scanner.nextLine();
						System.out.print("dai un voto dell'auto che vuoi inserire: ");
						int votoInserito = scanner.nextInt();
						scanner.nextLine();
						System.out.print("Inserisci la marca dell'auto che vuoi inserire: ");
						String marcaInserita = scanner.nextLine();
						System.out.print("Inserisci il modello dell'auto che vuoi inserire: ");
						String modelloInserito = scanner.nextLine();
						
						AutomobileClass automobile6 = new AutomobileClass(marcaInserita, modelloInserito, cilindrataInserita, votoInserito);
						automobili.add(automobile6);
						System.out.println("Automobile inserita con successo!");
					break;
					case 3:
						System.out.println("╔═══════════════════════════════════════╗");
						System.out.println("║               _______                 ║");
						System.out.println("║             //  ||\\ \\                 ║");
						System.out.println("║         ___//___||_\\ \\___             ║");
						System.out.println("║        |  ____  ||__|___ | |          ║");
						System.out.println("║        |_|   /_|-|-|-/_||-|           ║");
						System.out.println("║           (_ _)_) (_ _|_)             ║");
						System.out.println("║                                       ║");
						System.out.println("║           Pippo's Saloon              ║");
						System.out.println("╚═══════════════════════════════════════╝\n");
						
						System.out.print("Inserisci la cilindrata dell'auto che vuoi noleggiare: ");
						int cilindrataNoleggio = scanner.nextInt();
						scanner.nextLine();
						System.out.print("Inserisci la marca dell'auto che vuoi noleggiare: ");
						String marcaNoleggio = scanner.nextLine();
						System.out.print("Inserisci il modello dell'auto che vuoi noleggiare: ");
						String modelloNoleggio = scanner.nextLine();
						
						if((automobili.contains(marcaNoleggio) && automobili.contains(modelloNoleggio))) {
							AutomobileClass autoNoleggio = new AutomobileClass(marcaNoleggio, modelloNoleggio, cilindrataNoleggio, 0);
							autoNoleggiate.add(autoNoleggio);
							automobili.remove(cilindrataNoleggio);
							automobili.remove(marcaNoleggio);
							automobili.remove(modelloNoleggio);
							System.out.println("Auto noleggiata con successo!");
						}else {
							System.out.println("La macchina che hai scelto non e presente nel nostro catalogo, ci dispiace!");
						}
						
					break;
					case 4:
						System.out.println("╔═══════════════════════════════════════╗");
						System.out.println("║               _______                 ║");
						System.out.println("║             //  ||\\ \\                 ║");
						System.out.println("║         ___//___||_\\ \\___             ║");
						System.out.println("║        |  ____  ||__|___ | |          ║");
						System.out.println("║        |_|   /_|-|-|-/_||-|           ║");
						System.out.println("║           (_ _)_) (_ _|_)             ║");
						System.out.println("║                                       ║");
						System.out.println("║           Pippo's Saloon              ║");
						System.out.println("╚═══════════════════════════════════════╝\n");
						
						System.out.print("Inserisci la cilindrata dell'auto che vuoi restituire: ");
						int cilindrataRestituita = scanner.nextInt();
						scanner.nextLine();
						System.out.print("dai un voto dell'auto che vuoi restituire: ");
						int votoRestituita= scanner.nextInt();
						scanner.nextLine();
						System.out.print("Inserisci la marca dell'auto che vuoi restituire: ");
						String marcaRestituita = scanner.nextLine();
						System.out.print("Inserisci il modello dell'auto che vuoi nrestituire: ");
						String modelloRestituita = scanner.nextLine();
						
						if((autoNoleggiate.contains(marcaRestituita) && autoNoleggiate.contains(modelloRestituita))) {
							AutomobileClass autoRestituita = new AutomobileClass(marcaRestituita, modelloRestituita, cilindrataRestituita, votoRestituita);
							automobili.add(autoRestituita);
							autoNoleggiate.remove(cilindrataRestituita);
							autoNoleggiate.remove(marcaRestituita);
							autoNoleggiate.remove(modelloRestituita);
							System.out.println("Auto restituita con successo!");
						}else {
							System.out.println("La macchina che hai scelto non e presente tra le macchine a noleggio, devi noleggiare un'auto prima di poterla restituire");
						}
					break;
					case 5:
						System.out.println("╔═══════════════════════════════════════╗");
						System.out.println("║               _______                 ║");
						System.out.println("║             //  ||\\ \\                 ║");
						System.out.println("║         ___//___||_\\ \\___             ║");
						System.out.println("║        |  ____  ||__|___ | |          ║");
						System.out.println("║        |_|   /_|-|-|-/_||-|           ║");
						System.out.println("║           (_ _)_) (_ _|_)             ║");
						System.out.println("║                                       ║");
						System.out.println("║           Pippo's Saloon              ║");
						System.out.println("╚═══════════════════════════════════════╝\n");
	
						System.out.println("Automobili noleggiate: ");
						for(AutomobileClass auto:autoNoleggiate) {
							System.out.println(auto+"\n");
						}
					break;
					case 0:
						System.out.println("╔═════════════════════════════════════════╗");
						System.out.println("║                                    _____║");
						System.out.println("║                                  //  || ║");
						System.out.println("║              _______________ ___//___||_║");
						System.out.println("║      B          ___________ |  ____  ||_║");
						System.out.println("║      Y        _____________ |_|   /_|-|-║");
						System.out.println("║      E                         (_ _)_) (║");
						System.out.println("║                                         ║");
						System.out.println("║            Pippo's Saloon               ║");
						System.out.println("║                                         ║");
						System.out.println("║Grazie per averci scelti. Buona giornata!║");
						System.out.println("╚═════════════════════════════════════════╝\n");
						return;
					default:
						System.out.println("Valore non valido. Riprova");
				
				}

			}
		}

	}
}