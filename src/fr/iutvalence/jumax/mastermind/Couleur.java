package fr.iutvalence.jumax.mastermind;

/**
 * couleurs des pions
 * @author jumax
 */
public enum Couleur 
{
	/**
	 * La couleur verte
	 */
	VERT("V"),
	/**
	 * La couleur rouge
	 */
	ROUGE("R"),
	/**
	 * La couleur orange
	 */
	ORANGE("O"),
	/**
	 * La couleur violette
	 */
	VIOLET("Vi"),
	/**
	 * La couleur jaune
	 */
	JAUNE("J"),
	/**
	 * La couleur noire
	 */
	NOIR("N"),
	/**
	 * La couleur grise
	 */
	GRIS("G"),
	/**
	 * La couleur bleue
	 */
	BLEU("B"),
	/**
	 * La couleur blanche
	 */
	BLANC("W");
	
	/**
	 * Representation de la couleur
	 */
	private String representation;
	
	/**
	 * Constructeur de Couleur
	 * @param la représentation de la couleur choisie
	*/
	Couleur(String repr)
	{
		this.representation=repr;
	}
	
	/**
	 * Retourne une représentation texte de la couleur du pion
	 */
	public String toString()
	{
		return this.representation;
	}
	
}
