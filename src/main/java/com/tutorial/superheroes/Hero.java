package com.tutorial.superheroes;

/**
 * Clase con las características de un héroe
 * @author superman
 */
public class Hero {
	
	private final String name;
	private final int agility;
 
	/**
	 * Constructor
	 * @param name
	 * @param agility
	 */
	public Hero(String name, int agility) {
		super();
		this.name = name;
		this.agility = agility;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the agility
	 */
	public int getAgility() {
		return agility;
	}
	
	
	
}
