/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author ifksa
 */
public class Personnages {
    private String nom;
    private int niveauVie;

    
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    // niveau de vie
    public int getNiveauVie() {
        return niveauVie;
    }

    //nom
    public String getNom() {
        return nom;
    }

    
    public String toString() {
        return "Nom: " + nom + ", Niveau de vie: " + niveauVie;
    }

interface etreVivant {
    void seFatiguer();
    boolean estVivant();
    void estAttaque(int points);
}
abstract class Personnage implements etreVivant {
    protected String nom;
    protected int niveauVie;
    // ... autres attributs ...

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    // Implémentation des méthodes de l'interface etreVivant
    @Override
    public void seFatiguer() {
        niveauVie -= 10;
    }

    @Override
    public boolean estVivant() {
        return niveauVie > 0;
    }

    @Override
    public void estAttaque(int points) {
        niveauVie -= points;
    }

    // ... autres méthodes et membres ...
}

abstract class Personnage implements etreVivant {
    // ... autres méthodes et attributs ...

    abstract void attaquer(Personnage ennemi); // Cette méthode sera redéfinie dans les sous-classes
}

class Guerrier extends Personnage {
    // ... autres méthodes et attributs ...

    @Override
    void attaquer(Personnage ennemi) {
        ennemi.estAttaque(30);
    }
}

class Magicien extends Personnage {
    // ... autres méthodes et attributs ...

    @Override
    void attaquer(Personnage ennemi) {
        ennemi.estAttaque(20);
    }
}

public class Main {
    public static void main(String[] args) {
        Magicien magicien = new Magicien("Gandalf", 100, true); // supposant que true représente "confirmé"
        Guerrier guerrier = new Guerrier("Conan", 100, false);  // supposant que false représente "à pied"

        System.out.println("Avant combat:");
        System.out.println(magicien);
        System.out.println(guerrier);
        System.out.println("Nombre total de personnages : " + Personnage.nombrePersonnages);
        System.out.println("Nombre de guerriers : " + Guerrier.nombreGuerriers);
        System.out.println("Nombre de magiciens : " + Magicien.nombreMagiciens);

        guerrier.seFatiguer();

        System.out.println("\nAprès la fatigue du guerrier:");
        System.out.println(guerrier);
        System.out.println(guerrier.estVivant() ? "Le guerrier est toujours vivant" : "Le guerrier n'est plus vivant");

        guerrier.attaquer(magicien);

        System.out.println("\nAprès l'attaque du guerrier sur le magicien:");
        System.out.println(magicien);
        System.out.println(guerrier);
    }
}

}
    

