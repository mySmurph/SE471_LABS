public class BeginnerPlayerWeapon extends AWeapon {

	/**
	 * constructor for beginner weapon
	 * @param name
	 * @param weaponType
	 * @param damageType
	 */
	public BeginnerPlayerWeapon(String name, WeaponType weaponType, DamageType damageType) {
		super(name, -1, weaponType, damageType);
	}

}
