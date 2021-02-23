
public class IntermediatePlayerCharacter extends ACharacter {

	/**
	 * constructor for intermediate Expanse themed character 
	 * @param name
	 * @param charClass
	 */
	public IntermediatePlayerCharacter(String name, Archetype charClass) {
		super(name, charClass);
		this.greeting = String.format("%s this is %s from Expanse. \n", "Hello,", this.getName());
	}
}
