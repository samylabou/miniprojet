package org.univ;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriTest {

    @Test
    public void testMethodeTri() {
      String[] tableauEntreeNonTrie = {"05","04","15","19","10","08","07"};
      String[] tableauSortieTrie = {"04","05","07","08","10","15","19"};
        Tri tri = new Tri();
        assertArrayEquals( tableauSortieTrie, tri.triTab(tableauEntreeNonTrie));
 	}
}
