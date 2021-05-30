package fr.arsenelapostolet.garage;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicule {
    private String immat;
    private List<Panne> pannes = new ArrayList<>();

    public abstract String getDescription();

    public String getImmat() {
        return immat;
    }

    public int enregistrerDdeRep(String panne) {
        Panne p = new Panne(panne, this);
        this.pannes.add(p);
        return p.getNumero();
    }

    public boolean reparerPanne(int numPanne) {
        for (Panne p : this.pannes)
            if (p.getNumero() == numPanne)
                return p.reparerPanne();
        throw new RuntimeException("Panne non enregistrée");
    }
}