public abstract class AWeapon {
	
	/**
	 * Enumeration of damage that a weapon can cause
	 */
	public enum DamageType {
		SLASHING,
		BLUDGENING,
		PIERCING,
		NECROTIC,
		FIRE,
		RADIENT
	}
	
	/**
	 * Weapon types
	 */
	public enum WeaponType{
		SWORD("Sword", 8, 5),
		SPELLFOCUS("Spell Focus", 8, 90),
		DAGGER("Dagger", 4, 25),
		BOW("Bow and Arrow", 6, 120),
		GUN("Gun", 8, 90);
		
		String weapon;
		int damage;
		int range;
		WeaponType(String w, int d, int r){
			weapon = w;
			damage = d;
			range = r;
		}
		public String toString(){ return String.format("%dD %s", damage, weapon);}
	}

	/**
	 * the damage modifier of the weapon
	 */
	private int damage;
	
	/**
	 * the type of damage the weapon imposes
	 */
	private DamageType type;
	
	/**
	 * the type of weapon as defined by enumeration
	 */
	private WeaponType weaponType;
	
	/**
	 * the name of the weapon
	 */
	private String name;
	
	/**
	 * constructor for abstract weapon
	 * @param name
	 * @param damageMod
	 * @param weaponType
	 * @param damageType
	 */
	public AWeapon(String name, int damageMod, WeaponType weaponType, DamageType damageType) {
		this.name = name;
		this.damage = damageMod;
		this.weaponType = weaponType;
		this.type = damageType;
	}
	
	/**
	 * @return int - how much damage this weapon causes
	 */
	public int getDamage() {
		return weaponType.damage + damage;
	}
	
	/**
	 * @return DamageType - return the type of damage that the weapon
	 */
	public DamageType getDamageType() {
		return type;
	}
	
	/**
	 * @return a string that describes the weapon
	 */
	public String toString() {
		return String.format("%-20s [%dhp %+2d %-15s]", name, weaponType.damage, damage, weaponType.weapon);
	}
	
	/**
	 * @return the name of the weapon
	 */
	public String getName() { return name;}
	
}
