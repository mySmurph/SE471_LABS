
public class BeginnerPlayerCharacter extends ACharacter {

	/**
	 * constructor for a beginner Futurama themed character 
	 * @param name
	 * @param charClass
	 */
	public BeginnerPlayerCharacter(String name, Archetype charClass) {
		super(name, charClass);
		this.greeting = String.format("%s I'm %s from Futurama. \n", "Good News Everyone!", this.getName());
	}
}
