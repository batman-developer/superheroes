package com.tutorial.superheroes;

/**
 * Clase con las características de un héroe
 * @author superman
 */
public class Hero {
	
	private final String name;
	private final int speed;
 
	/**
	 * Constructor
	 * @param name
	 * @param speed
	 */
	public Hero(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
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

}
