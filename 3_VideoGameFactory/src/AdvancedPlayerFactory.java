import java.util.ArrayList;
import java.util.List;

public class AdvancedPlayerFactory implements IPlayerFactory {

	@Override
	public List<ACharacter> getCharacterModels() {
		List<ACharacter> futuramaCharacters = new ArrayList<ACharacter>();
		futuramaCharacters.add(new AdvancedPlayerCharacter("Arya Stark", ACharacter.CharacterClass.ROUGE, "/images/Advanced/Charcter/rouge.png"));
		futuramaCharacters.add(new AdvancedPlayerCharacter("Jon Snow", ACharacter.CharacterClass.KNIGHT, "/images/Advanced/Charcter/knight.png"));
		futuramaCharacters.add(new AdvancedPlayerCharacter("Pyat Pree", ACharacter.CharacterClass.WIZARD, "/images/Advanced/Charcter/wizard.png"));
		futuramaCharacters.add(new AdvancedPlayerCharacter("Melisandre", ACharacter.CharacterClass.CLAIRIC, "/images/Advanced/Charcter/clairic.png"));
		return futuramaCharacters;
	}

	@Override
	public List<AWeapon> getWeapons() {
		List<AWeapon> weapons = new ArrayList<AWeapon>();
		weapons.add(new AdvancedPlayerWeapon("Dragonglass", 1, AWeapon.WeaponType.DAGGER, AWeapon.DamageType.PIERCING, "/images/Advanced/Weapon/dagger.png"));
		weapons.add(new AdvancedPlayerWeapon("Crossbow", 1, AWeapon.WeaponType.GUN, AWeapon.DamageType.NECROTIC, "/images/Advanced/Weapon/gun.png"));
		weapons.add(new AdvancedPlayerWeapon("Heartsbane", 1,  AWeapon.WeaponType.SWORD, AWeapon.DamageType.SLASHING, "/images/Advanced/Weapon/sword.png"));
		weapons.add(new AdvancedPlayerWeapon("Ruby Neclace", 1, AWeapon.WeaponType.SPELLFOCUS, AWeapon.DamageType.RADIENT, "/images/Advanced/Weapon/focus.png"));
		weapons.add(new AdvancedPlayerWeapon("Longbow", 1,  AWeapon.WeaponType.BOW, AWeapon.DamageType.PIERCING, "/images/Advanced/Weapon/bow.png"));
		return weapons;
	}


}
