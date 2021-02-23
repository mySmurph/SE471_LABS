import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		IPlayerFactory pf = null;
		
		Scanner scanner = new Scanner(System.in);
		int menuselection;
		do {
			printLevel();
			menuselection = scanner.nextInt();
			switch(menuselection){
			case 1: pf = GameUtility.createPlayerFactory(GameUtility.Level.BEGINNER);
					break;
			case 2: pf = GameUtility.createPlayerFactory(GameUtility.Level.INTERMIDIATE);
				break;
			case 3: pf = GameUtility.createPlayerFactory(GameUtility.Level.BEGINNER);
				break;
			default:
				break;
			}
		}while(menuselection != 0);
		
	}
	
	public static void printLevel() {

		System.out.println("\n-----------------------------------------");
		System.out.printf("%-19s [%d] %-20s\n","Select a level:", 0, "Exit");
		System.out.printf("[%d] %-15s [%d] %-20s\n", 1, "Beginner", 3, "Advanced");
		System.out.printf("[%d] %-15s [%d] %-20s\n", 2, "Intermediate");
		System.out.println("-----------------------------------------");
		System.out.print("Selection: ");
		
	}
	
	public static void printChar() {
		
		System.out.println("\n-----------------------------------------");
		System.out.printf("%-19s [%d] %-20s\n","Select a Character:", 0, "Exit");
		System.out.printf("[%d] %-15s [%d] %-20s\n", 1, "Knight", 3, "Wizard");
		System.out.printf("[%d] %-15s [%d] %-20s\n", 2, "Cleric", 4, "Rouge");
		System.out.println("-----------------------------------------");
		System.out.print("Selection: ");
	}
	
	
	public static void printWeapon() {
		
		System.out.println("\n-----------------------------------------");
		System.out.printf("%-19s [%d] %-20s\n","Select a Weapon:", 0, "Exit");
		System.out.printf("[%d] %-15s [%d] %-20s\n", 1, "Sword", 3, "Dagger");
		System.out.printf("[%d] %-15s [%d] %-20s\n", 2, "Spell Focus", 4, "Bow");
		System.out.printf("[%d] %-15s [%d] %-20s\n", 5, "Gun");
		System.out.println("-----------------------------------------");
		System.out.print("Selection: ");
	}
}