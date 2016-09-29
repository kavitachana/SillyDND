package com.parents;

import com.app.Weapons;
import com.app.Weapons.Weapon;

public class CharacterClass {

	protected int health = 0;
	protected int magic = 0;
	protected String name = null;
	// Added Weapons
	protected static Weapon weapon = null;

	public CharacterClass() {
		super();
	}

	// Added weapons
	public CharacterClass(int health, int magic, String name, Weapon weapon) {
		super();
		this.health = health;
		this.magic = magic;
		this.name = name;
		this.weapon = weapon;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Added Weapon Getters and Setters
	public Weapon getWeapon() {
		return weapon;
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

}
