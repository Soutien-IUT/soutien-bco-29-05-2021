package fr.arsenelapostolet.garage;

public class Panne {
    private int numero;
    private static  int numAuto = 0;
    private String panne;
    private Vehicule vehicule;
    private boolean reparee = false;

    public Panne(String panne, Vehicule vehicule) {
        this.panne = panne;
        this.vehicule = vehicule;
        this.numero = numAuto++;
    }

    public int getNumero() {
        return numero;
    }

    public boolean reparerPanne(){
        this.reparee = true;
        return this.reparee;
    }
}
