package com.parents;

import com.app.Weapons.Weapon;

public class Human extends CharacterClass {

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Human(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		super.setHealth(health + 50);
	}

	@Override
	public void setMagic(int magic) {
		// TODO Auto-generated method stub
		super.setMagic(magic + 0);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("Mark");
	}

	
	
}
