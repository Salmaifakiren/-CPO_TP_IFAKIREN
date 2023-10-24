/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import com.mycompany.p3_heroic_fantasy_ifakiren.P3_Heroic_Fantasy_IFAKIREN;

/**
 *
 * @author ifksa
 */
public class Epée {class Epee extends P3_Heroic_Fantasy_IFAKIREN.Arme {
    private int finesse; // <100

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        if(finesse < 100) {
            this.finesse = finesse;
        } else {
            throw new IllegalArgumentException("Indice de finesse doit être < 100");
        }
    }
    
}
