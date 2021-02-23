import java.util.ArrayList;
import java.util.List;

public class IntermediatePlayerFactory implements IPlayerFactory {

	@Override
	public List<ACharacter> getCharacterModels() {
		List<ACharacter> futuramaCharacters = new ArrayList<ACharacter>();
		futuramaCharacters.add(new IntermediatePlayerCharacter("Amos Burton", ACharacter.CharacterClass.ROUGE));
		futuramaCharacters.add(new IntermediatePlayerCharacter("James Holden", ACharacter.CharacterClass.KNIGHT));
		futuramaCharacters.add(new IntermediatePlayerCharacter("Naomi Nagata", ACharacter.CharacterClass.WIZARD));
		futuramaCharacters.add(new IntermediatePlayerCharacter("Alex Kamal", ACharacter.CharacterClass.CLAIRIC));
		return futuramaCharacters;
	}

	@Override
	public List<AWeapon> getWeapons() {
		List<AWeapon> weapons = new ArrayList<AWeapon>();
		weapons.add(new IntermediatePlayerWeapon("Wrench", AWeapon.WeaponType.DAGGER, AWeapon.DamageType.BLUDGENING));
		weapons.add(new IntermediatePlayerWeapon("Rail Gun", AWeapon.WeaponType.GUN, AWeapon.DamageType.NECROTIC));
		weapons.add(new IntermediatePlayerWeapon("Broken Beam", AWeapon.WeaponType.SWORD, AWeapon.DamageType.SLASHING));
		weapons.add(new IntermediatePlayerWeapon("Comunicator", AWeapon.WeaponType.SPELLFOCUS, AWeapon.DamageType.RADIENT));
		weapons.add(new IntermediatePlayerWeapon("Standard UN Pistol", AWeapon.WeaponType.BOW, AWeapon.DamageType.PIERCING));
		return weapons;
	}


}
