package com.ourchars;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.Jedi;
import com.parents.Elf;

public class ElfJedi extends Elf implements Jedi {

	// Removed local jediWeapon

	public ElfJedi() {
		super();
	}

	public ElfJedi(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 50);
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 100);
	}

	//Overrode setWeapon
	@Override
	public void setWeapon(Weapon weapon) {
		super.setWeapon(Weapon.LIGHTSABER);
	}

	

	

}
