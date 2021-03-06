
public class AdvancedPlayerCharacter extends ACharacter {

	/**
	 * constructor for an advanced Game of Thrones themed character
	 * @param name
	 * @param charClass
	 */
	public AdvancedPlayerCharacter(String name, Archetype charClass) {
		super(name, charClass);
		this.greeting = String.format("%s I am %s , first of my name, of Game of Thrones. \n", "Evening.", this.getName());
	}

}
