package com.tutorial.superheroes;

/**
 * Clase con las caracter�sticas de un h�roe
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
