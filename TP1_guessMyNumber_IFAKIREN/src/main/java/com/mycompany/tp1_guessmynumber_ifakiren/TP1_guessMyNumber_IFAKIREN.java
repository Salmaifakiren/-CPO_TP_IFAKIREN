/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_guessmynumber_ifakiren;

/**
 *
 * @author ifksa
 */
public class TP1_guessMyNumber_IFAKIREN {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


import java.util.Random;
import java.util.Scanner;

public class DevinezLeNombre {
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner scanner = new Scanner(System.in);
        int nombreAleatoire;
        int tentativesMax;
        int intervalle;

        System.out.println("Choisissez votre niveau de difficulté (facile, normal, difficile):");
        String choix = scanner.nextLine().toLowerCase();

        switch (choix) {
            case "facile":
                intervalle = 50;
                tentativesMax = 10;
                break;
            case "normal":
                intervalle = 100;
                tentativesMax = 10;
                break;
            case "difficile":
                intervalle = 200;
                tentativesMax = 5;
                break;
            default:
                System.out.println("Choix non reconnu, niveau par défaut défini sur 'normal'.");
                intervalle = 100;
                tentativesMax = 10;
                break;
        }

        nombreAleatoire = generateurAleat.nextInt(intervalle + 1);

        int nombreSaisi = -1;
        int tentatives = 0;

        System.out.println("Veuillez saisir un nombre entre 0 et " + intervalle + ":");

        while (nombreSaisi != nombreAleatoire && tentatives < tentativesMax) {
            nombreSaisi = scanner.nextInt();
            tentatives++;

            if (nombreSaisi < nombreAleatoire) {
                if (choix.equals("facile") && (nombreAleatoire - nombreSaisi) > 20) {
                    System.out.println("Vraiment trop petit");
                } else {
                    System.out.println("Trop petit");
                }
            } else if (nombreSaisi > nombreAleatoire) {
                if (choix.equals("facile") && (nombreSaisi - nombreAleatoire) > 20) {
                    System.out.println("Vraiment trop grand");
                } else {
                    System.out.println("Trop grand");
                }
            } else {
                System.out.println("Gagné");
                System.out.println("Vous avez trouvé le nombre en " + tentatives + " tentatives.");
            }
        }

        if (nombreSaisi != nombreAleatoire) {
            System.out.println("Vous avez épuisé toutes vos tentatives. Le nombre était " + nombreAleatoire + ".");
        }

        scanner.close();
    }
}




