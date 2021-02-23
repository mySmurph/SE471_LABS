import java.util.ArrayList;
import java.util.List;

public class AdvancedPlayerFactory implements IPlayerFactory {

	/**
	 * @return List<ACharacter> a list of pre-made Game of Thrones themed Characters
	 */
	@Override
	public List<ACharacter> getCharacterModels() {
		List<ACharacter> futuramaCharacters = new ArrayList<ACharacter>();
		futuramaCharacters.add(new AdvancedPlayerCharacter("Arya Stark", ACharacter.Archetype.ROUGE));
		futuramaCharacters.add(new AdvancedPlayerCharacter("Jon Snow", ACharacter.Archetype.KNIGHT));
		futuramaCharacters.add(new AdvancedPlayerCharacter("Pyat Pree", ACharacter.Archetype.WIZARD));
		futuramaCharacters.add(new AdvancedPlayerCharacter("Melisandre", ACharacter.Archetype.CLAIRIC));
		return futuramaCharacters;
	}

	/**
	 * @return List<AWeapon> a list of pre-made Game of Thrones themed Weapons
	 */
	@Override
	public List<AWeapon> getWeapons() {
		List<AWeapon> weapons = new ArrayList<AWeapon>();
		weapons.add(new AdvancedPlayerWeapon("Dragonglass", AWeapon.WeaponType.DAGGER, AWeapon.DamageType.PIERCING));
		weapons.add(new AdvancedPlayerWeapon("Crossbow", AWeapon.WeaponType.GUN, AWeapon.DamageType.NECROTIC));
		weapons.add(new AdvancedPlayerWeapon("Heartsbane", AWeapon.WeaponType.SWORD, AWeapon.DamageType.SLASHING));
		weapons.add(new AdvancedPlayerWeapon("Ruby Neclace", AWeapon.WeaponType.SPELLFOCUS, AWeapon.DamageType.RADIENT));
		weapons.add(new AdvancedPlayerWeapon("Longbow", AWeapon.WeaponType.BOW, AWeapon.DamageType.PIERCING));
		return weapons;
	}


}
