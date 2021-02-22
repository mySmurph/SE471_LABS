public abstract class ACharacter {

	public enum CharacterClass {
		KNIGHT("Knight"),
		CLAIRIC("Clairic"),
		WIZARD("Wizard"),
		ROUGE("Rouge");
		
		String charclass;
		CharacterClass(String c){ charclass = c;}
		public String toString() {return charclass;}
	}
	
	private String name;
	private int lvl;
	private CharacterClass charClass;
	
	public ACharacter(String name, CharacterClass charClass){
		this.name = name;
		this.charClass = charClass;
		this.lvl = 1;
	}
	
	public String toString() {
		return String.format("%s - Level %d %s", name, lvl, charClass.toString());
	}
	
	public void levelUp() {
		lvl++;
	}
	public String greeting() {
		return null;
	}
	public String getName() { return name;}
}
