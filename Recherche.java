package org.univ;

import java.util.Arrays;

public class Recherche {

   public String rechTab( String[] tableau, String entree) {
   
	   
   // afficher tous les éléments
   for (String valeur : tableau) {
   System.out.println("valeur = " + valeur);
   }
   // trier le tableau
   Arrays.sort(tableau);
   // afficher tous les éléments triés
   System.out.println("Tableau suite au tri");
   for (String valeur : tableau) {
   System.out.println("Valeur = " + valeur);
   }

   for (int index = 0; index < tableau.length; index++)
  {
       if ( tableau[index] == entree )
             return entree;  //trouvé
  }
   
   //retourner la valeur si trouvée, sinon retourner -1
   return "-1";   
   }
}
