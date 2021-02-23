import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		IPlayerFactory pf = null;
		
		/**
		 * while selection is null determine player selection
		 */
		
		Scanner scanner = new Scanner(System.in);
		int menuselection;
		do {
			printLevelMenu();
			menuselection = scanner.nextInt();
			switch(menuselection){
			case 1: pf = GameUtility.createPlayerFactory(GameUtility.Level.BEGINNER);
					break;
			case 2: pf = GameUtility.createPlayerFactory(GameUtility.Level.INTERMEDIATE);
				break;
			case 3: pf = GameUtility.createPlayerFactory(GameUtility.Level.ADVANCED);
				break;
			default:
				break;
			}
		}while(pf == null);
		
		/**
		 * get player character model from list
		 */
		
		List<ACharacter> charOptions = pf.getCharacterModels();
		ACharacter myCharacter = null;
		do {
			printCharMenu(charOptions);
			menuselection = scanner.nextInt();
			if(menuselection >0 && menuselection <= charOptions.size()) {
				myCharacter = charOptions.get(menuselection - 1);
			}
		}while(myCharacter == null);
		
		/**
		 * get player weapon model from list
		 */
		
		List<AWeapon> wepOptions = pf.getWeaponsModels();
		AWeapon myWeapon = null;
		do {
			printWeaponMenu(wepOptions);
			menuselection = scanner.nextInt();
			if(menuselection >0 && menuselection <= wepOptions.size()) {
				myWeapon = wepOptions.get(menuselection - 1);
			}
		}while(myWeapon == null);
		
		/**
		 * print selected greeting based on player input
		 */
		
		System.out.println(myCharacter.greeting());
	}
	
	/**
	 * print select level menu
	 */

	public static void printLevelMenu() {

		System.out.println("\n-----------------------------------------");
		System.out.printf("%-19s [%d] %-20s\n","Select a level:", 0, "Exit");
		System.out.printf("[%d] %-15s [%d] %-20s\n", 1, "Beginner", 3, "Advanced");
		System.out.printf("[%d] %-15s \n", 2, "Intermediate");
		System.out.println("-----------------------------------------");
		System.out.print("Selection: ");
		
	}
	
	/**
	 * @param charOptions prints all options in chosen level characters
	 */
	
	public static void printCharMenu(List<ACharacter> charOptions) {
		
		System.out.println("\n-----------------------------------------");
		System.out.printf("%-19s [%d] %-20s\n","Select a Character:", 0, "Exit");
		int i = 0;
		for(ACharacter c : charOptions) {
			i++;
			System.out.printf("[%d]\t%s\n", i,c.toString());
		}
		System.out.println("-----------------------------------------");
		System.out.print("Selection: ");
	}
	
	/**
	 * @param wepOptions prints all options in chosen level weapons
	 */
	
	public static void printWeaponMenu(List<AWeapon> wepOptions) {
		
		System.out.println("\n-----------------------------------------");
		System.out.printf("%-19s [%d] %-20s\n","Select a Weapon:", 0, "Exit");
		int i = 0;
		for(AWeapon w : wepOptions) {
			i++;
			System.out.printf("[%d]\t%s\n", i,w.toString());
		}
		System.out.println("-----------------------------------------");
		System.out.print("Selection: ");
	}
}