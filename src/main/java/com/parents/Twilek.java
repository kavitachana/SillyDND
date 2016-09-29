package com.parents;

import com.app.Weapons.Weapon;

public class Twilek extends CharacterClass {

	public Twilek() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Twilek(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		super.setHealth(health + 75);
	}

	@Override
	public void setMagic(int magic) {
		// TODO Auto-generated method stub
		super.setMagic(magic + 10);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("Oolan");
	}

	
	
}
