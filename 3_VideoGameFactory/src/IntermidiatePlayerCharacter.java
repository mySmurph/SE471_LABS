
public class IntermidiatePlayerCharacter extends ACharacter {

	public IntermidiatePlayerCharacter(String name, CharacterClass charClass) {
		super(name, charClass);
	}
	public String greeting() {
		return String.format("%s this is %s from Expnace. \n", "Hello,", this.getName());
	}

}
