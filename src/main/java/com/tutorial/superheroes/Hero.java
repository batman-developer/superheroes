package com.tutorial.superheroes;

/**
 * Clase con las caracter�sticas de un h�roe
 * @author superman
 */
public class Hero { 
	
	private final String name;
	private final int speed;
	private final int agility;
 
	/**
	 * Constructor
	 * @param name
	 * @param speed
	 * @param agility
	 */
	public Hero(String name, int speed, int agility) {
		super();
		this.name = name;
		this.speed = speed;
		this.agility = agility;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the name
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * @return the agility
	 */
	public int getAgility() {
		return agility;
	}

}
