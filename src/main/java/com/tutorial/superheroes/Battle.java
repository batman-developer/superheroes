package com.tutorial.superheroes;

/**
 * Simula una batalla entre dos héroes
 * @author david
 */
public class Battle {
	
	private Hero hero1;
	private Hero hero2;
	
	/**
	 * Constructor
	 * @param hero1
	 * @param hero2
	 */
	public Battle(Hero hero1, Hero hero2) {
		super();
		this.hero1 = hero1;
		this.hero2 = hero2;
	}

	/**
	 * Devuelve el ganador de la batalla
	 * @return Ganador
	 */
	public Hero getWinner() {
		return this.hero1 != null && this.hero2 == null ? this.hero1 : this.hero2;
	}

}
