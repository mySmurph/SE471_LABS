import java.util.ArrayList;
import java.util.List;

public class IntermediatePlayerFactory implements IPlayerFactory {

	@Override
	public List<ACharacter> getCharacterModels() {
		List<ACharacter> futuramaCharacters = new ArrayList<ACharacter>();
		futuramaCharacters.add(new IntermidiatePlayerCharacter("Amos Burton", ACharacter.CharacterClass.ROUGE, "/images/Intermidiate/Charcter/rouge.png"));
		futuramaCharacters.add(new IntermidiatePlayerCharacter("James Holden", ACharacter.CharacterClass.KNIGHT, "/images/Intermidiate/Charcter/knight.png"));
		futuramaCharacters.add(new IntermidiatePlayerCharacter("Naomi Nagata", ACharacter.CharacterClass.WIZARD, "/images/Intermidiate/Charcter/wizard.png"));
		futuramaCharacters.add(new IntermidiatePlayerCharacter("Alex Kamal", ACharacter.CharacterClass.CLAIRIC, "/images/Intermidiate/Charcter/clairic.png"));
		return futuramaCharacters;
	}

	@Override
	public List<AWeapon> getWeapons() {
		List<AWeapon> weapons = new ArrayList<AWeapon>();
		weapons.add(new IntermidiatePlayerWeapon("Wrench", 0, AWeapon.WeaponType.DAGGER, AWeapon.DamageType.BLUDGENING, "/images/Intermidiate/Weapon/dagger.png"));
		weapons.add(new IntermidiatePlayerWeapon("Rail Gun", 0, AWeapon.WeaponType.GUN, AWeapon.DamageType.NECROTIC, "/images/Intermidiate/Weapon/gun.png"));
		weapons.add(new IntermidiatePlayerWeapon("Broken Beam", 0,  AWeapon.WeaponType.SWORD, AWeapon.DamageType.SLASHING, "/images/Intermidiate/Weapon/sword.png"));
		weapons.add(new IntermidiatePlayerWeapon("Com", 0, AWeapon.WeaponType.SPELLFOCUS, AWeapon.DamageType.RADIENT, "/images/Intermidiate/Weapon/focus.png"));
		weapons.add(new IntermidiatePlayerWeapon("Standard UN Pistol", 0,  AWeapon.WeaponType.BOW, AWeapon.DamageType.PIERCING, "/images/Intermidiate/Weapon/bow.png"));
		return weapons;
	}


}
