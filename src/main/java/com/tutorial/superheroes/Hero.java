package com.tutorial.superheroes;

/**
 * Clase con las caracter�sticas de un h�roe. Incluye informaci�n necesaria para
 * simular batallas entre diferentes h�roes y datos descriptivos sobre ellos.
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
	 * @param strength
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
