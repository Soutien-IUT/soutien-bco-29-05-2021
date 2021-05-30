package fr.arsenelapostolet.garage;

public class Voiture extends Vehicule {
    private int nbPortes;

    public int getNbPortes() {
        return nbPortes;
    }

    @Override
    public String getDescription() {
        return String.format("Voiture %s avec %d portes", this.getImmat(), this.getNbPortes());
    }
}
