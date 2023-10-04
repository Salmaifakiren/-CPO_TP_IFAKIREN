/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_stats_ifakiren;

/**
 *
 * @author ifksa
 */
public class TP1_stats_IFAKIREN {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

import java.util.Random;
import java.util.Scanner;

public class LancerDe {

    public static void main(String[] args) {
        
        int[] tableau = new int[6];  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier m:");
        int m = scanner.nextInt();
        Random generateurAleat = new Random();
        for (int i = 0; i < m; i++) {
            int aleatoire = generateurAleat.nextInt(6);  
            tableau[aleatoire]++;
        }
        System.out.println("Résultats:");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Face " + (i+1) + ": " + tableau[i] + " fois.");
        }
        System.out.println("\nRésultats en pourcentages:");
        for (int i = 0; i < tableau.length; i++) {
            double pourcentage = (double) tableau[i] / m * 100;
            System.out.println("Face "+(i+1)+": "+pourcentage+ "%"); 

        
    }
}
