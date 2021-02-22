import java.util.ArrayList;
import java.util.List;

public class IntermediatePlayerFactory implements IPlayerFactory {

	@Override
	public List<ACharacter> getCharacterModels() {
		List<ACharacter> futuramaCharacters = new ArrayList<ACharacter>();
		futuramaCharacters.add(new IntermidiatePlayerCharacter("Amos Burton", ACharacter.CharacterClass.ROUGE));
		futuramaCharacters.add(new IntermidiatePlayerCharacter("James Holden", ACharacter.CharacterClass.KNIGHT));
		futuramaCharacters.add(new IntermidiatePlayerCharacter("Naomi Nagata", ACharacter.CharacterClass.WIZARD));
		futuramaCharacters.add(new IntermidiatePlayerCharacter("Alex Kamal", ACharacter.CharacterClass.CLAIRIC));
		return futuramaCharacters;
	}

	@Override
	public List<AWeapon> getWeapons() {
		List<AWeapon> weapons = new ArrayList<AWeapon>();
		weapons.add(new IntermidiatePlayerWeapon("Wrench", AWeapon.WeaponType.DAGGER, AWeapon.DamageType.BLUDGENING));
		weapons.add(new IntermidiatePlayerWeapon("Rail Gun", AWeapon.WeaponType.GUN, AWeapon.DamageType.NECROTIC));
		weapons.add(new IntermidiatePlayerWeapon("Broken Beam", AWeapon.WeaponType.SWORD, AWeapon.DamageType.SLASHING));
		weapons.add(new IntermidiatePlayerWeapon("Comunicator", AWeapon.WeaponType.SPELLFOCUS, AWeapon.DamageType.RADIENT));
		weapons.add(new IntermidiatePlayerWeapon("Standard UN Pistol", AWeapon.WeaponType.BOW, AWeapon.DamageType.PIERCING));
		return weapons;
	}


}
