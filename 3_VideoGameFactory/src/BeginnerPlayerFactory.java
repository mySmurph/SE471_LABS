import java.util.ArrayList;
import java.util.List;


public class BeginnerPlayerFactory implements IPlayerFactory {

	@Override
	public List<ACharacter> getCharacterModels() {
		List<ACharacter> futuramaCharacters = new ArrayList<ACharacter>();
		futuramaCharacters.add(new BeginnerPlayerCharacter("Bender", ACharacter.CharacterClass.ROUGE, "/images/Begginer/Charcter/rouge.png"));
		futuramaCharacters.add(new BeginnerPlayerCharacter("Leela", ACharacter.CharacterClass.KNIGHT, "/images/Begginer/Charcter/knight.png"));
		futuramaCharacters.add(new BeginnerPlayerCharacter("Dr. Farnsworth", ACharacter.CharacterClass.WIZARD, "/images/Begginer/Charcter/wizard.png"));
		futuramaCharacters.add(new BeginnerPlayerCharacter("Dr. Zoidburge", ACharacter.CharacterClass.CLAIRIC, "/images/Begginer/Charcter/clairic.png"));
		return futuramaCharacters;
	}

	@Override
	public List<AWeapon> getWeapons() {
		List<AWeapon> weapons = new ArrayList<AWeapon>();
		weapons.add(new BeginnerPlayerWeapon("Broken Beer Bottle", -1, AWeapon.WeaponType.DAGGER, AWeapon.DamageType.BLUDGENING, "/images/Begginer/Weapon/dagger.png"));
		weapons.add(new BeginnerPlayerWeapon("Blaster", -1, AWeapon.WeaponType.GUN, AWeapon.DamageType.NECROTIC, "/images/Begginer/Weapon/gun.png"));
		weapons.add(new BeginnerPlayerWeapon("Norwal Horn", -1,  AWeapon.WeaponType.SWORD, AWeapon.DamageType.SLASHING, "/images/Begginer/Weapon/sword.png"));
		weapons.add(new BeginnerPlayerWeapon("7 Leaf Clover", -1, AWeapon.WeaponType.SPELLFOCUS, AWeapon.DamageType.RADIENT, "/images/Begginer/Weapon/focus.png"));
		weapons.add(new BeginnerPlayerWeapon("Sling Shot", -1,  AWeapon.WeaponType.BOW, AWeapon.DamageType.PIERCING, "/images/Begginer/Weapon/bow.png"));
		return weapons;
	}

}
