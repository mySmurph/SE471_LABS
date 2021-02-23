import java.util.ArrayList;
import java.util.List;

public class IntermediatePlayerFactory implements IPlayerFactory {

	/**
	 * @return List<ACharacter> a list of pre-made Expanse themed Characters
	 */
	@Override
	public List<ACharacter> getCharacterModels() {
		List<ACharacter> futuramaCharacters = new ArrayList<ACharacter>();
		futuramaCharacters.add(new IntermediatePlayerCharacter("Amos Burton", ACharacter.Archetype.ROUGE));
		futuramaCharacters.add(new IntermediatePlayerCharacter("James Holden", ACharacter.Archetype.KNIGHT));
		futuramaCharacters.add(new IntermediatePlayerCharacter("Naomi Nagata", ACharacter.Archetype.WIZARD));
		futuramaCharacters.add(new IntermediatePlayerCharacter("Alex Kamal", ACharacter.Archetype.CLAIRIC));
		return futuramaCharacters;
	}

	/**
	 * @return List<AWeapon> a list of pre-made Expanse themed Weapons
	 */
	@Override
	public List<AWeapon> getWeaponsModels() {
		List<AWeapon> weapons = new ArrayList<AWeapon>();
		weapons.add(new IntermediatePlayerWeapon("Wrench", AWeapon.WeaponType.DAGGER, AWeapon.DamageType.BLUDGENING));
		weapons.add(new IntermediatePlayerWeapon("Rail Gun", AWeapon.WeaponType.GUN, AWeapon.DamageType.NECROTIC));
		weapons.add(new IntermediatePlayerWeapon("Broken Beam", AWeapon.WeaponType.SWORD, AWeapon.DamageType.SLASHING));
		weapons.add(new IntermediatePlayerWeapon("Comunicator", AWeapon.WeaponType.SPELLFOCUS, AWeapon.DamageType.RADIENT));
		weapons.add(new IntermediatePlayerWeapon("Standard UN Pistol", AWeapon.WeaponType.BOW, AWeapon.DamageType.PIERCING));
		return weapons;
	}


}
