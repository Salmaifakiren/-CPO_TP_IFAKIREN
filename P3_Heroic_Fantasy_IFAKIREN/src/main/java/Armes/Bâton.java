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
public class Bâton {class Baton extends P3_Heroic_Fantasy_IFAKIREN.Arme {
    private int age; // <100

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        if(age < 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Âge doit être < 100");
        }
    }
    
}
