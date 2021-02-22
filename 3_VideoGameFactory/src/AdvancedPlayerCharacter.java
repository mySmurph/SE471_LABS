
public class AdvancedPlayerCharacter extends ACharacter {

	public AdvancedPlayerCharacter(String name, CharacterClass charClass) {
		super(name, charClass);
	}

	public String greeting() {
		return String.format("%s I am %s , fist of my name, of Game of Thrones. \n", "Evning.", this.getName());
	}
}
