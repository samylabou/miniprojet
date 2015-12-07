//package org.univ;

import java.util.Arrays;

public class Tri {

   public String[] triTab( String[] iArr) {

   // afficher tous les éléments
   for (String valeur : iArr) {
   System.out.println("valeur = " + valeur);
   }
   // trier le tableau
   Arrays.sort(iArr);
   // afficher tous les éléments triés
   System.out.println("Tableau suite au tri");
   for (String valeur : iArr) {
   System.out.println("Valeur = " + valeur);
   }
   
   //retourner le tableau trié
   return iArr;   
   }
}
