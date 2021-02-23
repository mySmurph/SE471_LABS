public abstract class ACharacter {
	/**
	 * Enumerated Types of Character Class Archetypes
	 */
	public enum Archetype {
		KNIGHT("Knight"),
		CLAIRIC("Clairic"),
		WIZARD("Wizard"),
		ROUGE("Rouge");
		
		String charclass;
		Archetype(String c){ charclass = c;}
		public String toString() {return charclass;}
	}
	
	/**
	 * The name of the character
	 */
	private String name;
	
	/**
	 * the level of the character
	 */
	private int lvl;
	
	/**
	 * the Class archetype of the character
	 */
	private Archetype arch;
	
	/**
	 * string that holds standard greeting
	 */
	protected String greeting = "Greeting Not Defined";
	
	/**
	 * constructor
	 * @param name
	 * @param charClass
	 */
	public ACharacter(String name, Archetype charClass){
		this.name = name;
		this.arch = charClass;
		this.lvl = 1;
	}
	
	/**
	 * returns a string that describes the character 
	 * @return string
	 */
	public String toString() {
		return String.format("%s - Level %d %s", name, lvl, arch.toString());
	}
	
	/**
	 * level up the character
	 */
	public void levelUp() {
		lvl++;
	}
	
	/**
	 * returns a string of the character's greeting
	 * @return null if undefined
	 */
	public String greeting() {
		return greeting;
	}
	
	/**
	 * return the name of the character
	 * @return string
	 */
	public String getName() { return name;}
	
	/**
	 * return the current level of the character
	 * @return int
	 */
	public int getLevel() {return lvl;}
}
