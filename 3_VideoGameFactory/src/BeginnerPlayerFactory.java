import java.util.ArrayList;
import java.util.List;


public class BeginnerPlayerFactory implements IPlayerFactory {

	/**
	 * @return List<ACharacter> a list of pre-made Futurama themed Characters
	 */
	@Override
	public List<ACharacter> getCharacterModels() {
		List<ACharacter> futuramaCharacters = new ArrayList<ACharacter>();
		futuramaCharacters.add(new BeginnerPlayerCharacter("Bender", ACharacter.Archetype.ROUGE));
		futuramaCharacters.add(new BeginnerPlayerCharacter("Leela", ACharacter.Archetype.KNIGHT));
		futuramaCharacters.add(new BeginnerPlayerCharacter("Dr. Farnsworth", ACharacter.Archetype.WIZARD));
		futuramaCharacters.add(new BeginnerPlayerCharacter("Dr. Zoidburge", ACharacter.Archetype.CLAIRIC));
		return futuramaCharacters;
	}

	/**
	 * @return List<AWeapon> a list of pre-made Futurama themed Weapons
	 */
	@Override
	public List<AWeapon> getWeaponsModels() {
		List<AWeapon> weapons = new ArrayList<AWeapon>();
		weapons.add(new BeginnerPlayerWeapon("Broken Beer Bottle", AWeapon.WeaponType.DAGGER, AWeapon.DamageType.BLUDGENING));
		weapons.add(new BeginnerPlayerWeapon("Blaster", AWeapon.WeaponType.GUN, AWeapon.DamageType.NECROTIC));
		weapons.add(new BeginnerPlayerWeapon("Norwal Horn", AWeapon.WeaponType.SWORD, AWeapon.DamageType.SLASHING));
		weapons.add(new BeginnerPlayerWeapon("7 Leaf Clover", AWeapon.WeaponType.SPELLFOCUS, AWeapon.DamageType.RADIENT));
		weapons.add(new BeginnerPlayerWeapon("Sling Shot", AWeapon.WeaponType.BOW, AWeapon.DamageType.PIERCING));
		return weapons;
	}

}
