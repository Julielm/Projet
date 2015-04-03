package fr.iutvalence.jumax.mastermind;

/**
 * Couleurs des pions.
 *
 * @author jumax
 * @version 1.0.0
 */
public enum Couleur {
    /** La couleur verte. */
    VERT("V"),
    /** La couleur rouge. */
    ROUGE("R"),
    /** La couleur orange. */
    ORANGE("O"),
    /** La couleur violette. */
    VIOLET("Vi"),
    /** La couleur jaune. */
    JAUNE("J"),
    /** La couleur noire. */
    NOIR("N"),
    /** La couleur grise. */
    GRIS("G"),
    /** La couleur bleue. */
    BLEU("B"),
    /** La couleur blanche. */
    BLANC("W");
    /** Representation de la couleur. */
    private final String representation;

    /**
     * Constructeur de Couleur.
     *
     * @param repr La représentation de la couleur choisie
     */
    Couleur(String repr) {
        this.representation = repr;
    }

    @Override
    public String toString() {
        return this.representation;
    }
}
