import java.util.ArrayList;
import java.util.List;


public class BeginnerPlayerFactory implements IPlayerFactory {

	@Override
	public List<ACharacter> getCharacterModels() {
		List<ACharacter> futuramaCharacters = new ArrayList<ACharacter>();
		futuramaCharacters.add(new BeginnerPlayerCharacter("Bender", ACharacter.CharacterClass.ROUGE));
		futuramaCharacters.add(new BeginnerPlayerCharacter("Leela", ACharacter.CharacterClass.KNIGHT));
		futuramaCharacters.add(new BeginnerPlayerCharacter("Dr. Farnsworth", ACharacter.CharacterClass.WIZARD));
		futuramaCharacters.add(new BeginnerPlayerCharacter("Dr. Zoidburge", ACharacter.CharacterClass.CLAIRIC));
		return futuramaCharacters;
	}

	@Override
	public List<AWeapon> getWeapons() {
		List<AWeapon> weapons = new ArrayList<AWeapon>();
		weapons.add(new BeginnerPlayerWeapon("Broken Beer Bottle", AWeapon.WeaponType.DAGGER, AWeapon.DamageType.BLUDGENING));
		weapons.add(new BeginnerPlayerWeapon("Blaster", AWeapon.WeaponType.GUN, AWeapon.DamageType.NECROTIC));
		weapons.add(new BeginnerPlayerWeapon("Norwal Horn", AWeapon.WeaponType.SWORD, AWeapon.DamageType.SLASHING));
		weapons.add(new BeginnerPlayerWeapon("7 Leaf Clover", AWeapon.WeaponType.SPELLFOCUS, AWeapon.DamageType.RADIENT));
		weapons.add(new BeginnerPlayerWeapon("Sling Shot", AWeapon.WeaponType.BOW, AWeapon.DamageType.PIERCING));
		return weapons;
	}

}
