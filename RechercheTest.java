package org.univ;

import static org.junit.Assert.*;

import org.junit.Test;

public class RechercheTest {


    @Test
    public void testMethodeRecherche() {
      String[] tableauEntreeNonTrie = {"05","04","15","19","10","08","07"};
		Tri tri = new Tri();
	 String[] tab = tri.triTab(tableauEntreeNonTrie);
	  String entree = "08";
        Recherche recherche = new Recherche();
        assertEquals( entree, recherche.rechTab(tab, entree));
 	}
}
