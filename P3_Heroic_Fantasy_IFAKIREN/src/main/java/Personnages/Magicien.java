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
public class Magicien {class Magicien extends P3_Heroic_Fantasy_IFAKIREN.Personnage {
    private boolean estConfirme;

    
    public Magicien(String nom, int niveauVie, boolean estConfirme) {
        super(nom, niveauVie);
        this.estConfirme = estConfirme;
    }

    
    public void setEstConfirme(boolean estConfirme) {
        this.estConfirme = estConfirme;
    }

    
    public String toString() {
        return super.toString() + ", Confirmé: " + estConfirme;
    }
}
    
}
