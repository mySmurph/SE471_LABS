
public class IntermediatePlayerCharacter extends ACharacter {

	public IntermediatePlayerCharacter(String name, CharacterClass charClass) {
		super(name, charClass);
	}
	public String greeting() {
		return String.format("%s this is %s from Expnace. \n", "Hello,", this.getName());
	}

}
