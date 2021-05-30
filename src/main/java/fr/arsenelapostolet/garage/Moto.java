package fr.arsenelapostolet.garage;

public class Moto extends Vehicule {

    private int cylindree;

    public int getCylindree() {
        return cylindree;
    }

    @Override
    public String getDescription() {
        return String.format("Moto %s de %d cm3", this.getImmat(), this.getCylindree());
    }
}
