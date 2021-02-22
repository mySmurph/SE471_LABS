
public class BeginnerPlayerCharacter extends ACharacter {

	public BeginnerPlayerCharacter(String name, CharacterClass charClass) {
		super(name, charClass);
	}
	
	public String greeting() {
		return String.format("%s I'm %s from Futurama. \n", "Good News Everyone!", this.getName());
	}

}
