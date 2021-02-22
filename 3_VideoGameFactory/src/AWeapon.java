public abstract class AWeapon {
	
	public enum DamageType {
		SLASHING,
		BLUDGENING,
		PIERCING,
		NECROTIC,
		FIRE,
		RADIENT
	}
	public enum WeaponType{
		SWORD("Sword"),
		SPELLFOCUS("Spell Focus"),
		DAGGER("Dagger"),
		BOW("Bow and Arrow"),
		GUN("Gun");
		
		String weapon;
		WeaponType(String w){weapon = w;}
		public String toString(){ return weapon;}
	}

	private int damage;
	private DamageType type;
	private WeaponType weaponType;
	private String name;
	
	public AWeapon(String name, int initialDamage, WeaponType weaponType, DamageType damageType) {
		this.name = name;
		this.damage = initialDamage;
		this.weaponType = weaponType;
		this.type = damageType;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public DamageType getDamageType() {
		return type;
	}
	
	public String toString() {
		return String.format("%-20s [%+2d %-15s]", name, damage, weaponType.toString());
	}
	
	public String getName() { return name;}
	
}
