/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import com.mycompany.p3_heroic_fantasy_ifakiren.P3_Heroic_Fantasy_IFAKIREN;

/**
 *
 * @author ifksa
 */
public class Guerriers {class Guerrier extends P3_Heroic_Fantasy_IFAKIREN.Personnage {
    private boolean aCheval;

    
    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
    }

    /
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    
    public String toString() {
        return super.toString() + ", À cheval: " + aCheval;
    }
}
    
}
