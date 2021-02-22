import java.util.ArrayList;
import java.util.List;

public class AdvancedPlayerFactory implements IPlayerFactory {

	@Override
	public List<ACharacter> getCharacterModels() {
		List<ACharacter> futuramaCharacters = new ArrayList<ACharacter>();
		futuramaCharacters.add(new AdvancedPlayerCharacter("Arya Stark", ACharacter.CharacterClass.ROUGE));
		futuramaCharacters.add(new AdvancedPlayerCharacter("Jon Snow", ACharacter.CharacterClass.KNIGHT));
		futuramaCharacters.add(new AdvancedPlayerCharacter("Pyat Pree", ACharacter.CharacterClass.WIZARD));
		futuramaCharacters.add(new AdvancedPlayerCharacter("Melisandre", ACharacter.CharacterClass.CLAIRIC));
		return futuramaCharacters;
	}

	@Override
	public List<AWeapon> getWeapons() {
		List<AWeapon> weapons = new ArrayList<AWeapon>();
		weapons.add(new AdvancedPlayerWeapon("Dragonglass", 1, AWeapon.WeaponType.DAGGER, AWeapon.DamageType.PIERCING));
		weapons.add(new AdvancedPlayerWeapon("Crossbow", 1, AWeapon.WeaponType.GUN, AWeapon.DamageType.NECROTIC));
		weapons.add(new AdvancedPlayerWeapon("Heartsbane", 1,  AWeapon.WeaponType.SWORD, AWeapon.DamageType.SLASHING));
		weapons.add(new AdvancedPlayerWeapon("Ruby Neclace", 1, AWeapon.WeaponType.SPELLFOCUS, AWeapon.DamageType.RADIENT));
		weapons.add(new AdvancedPlayerWeapon("Longbow", 1,  AWeapon.WeaponType.BOW, AWeapon.DamageType.PIERCING));
		return weapons;
	}


}
