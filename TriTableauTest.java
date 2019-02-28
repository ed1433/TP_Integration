package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriTableauTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTrier() {
		
	}

	@Test
	//Test_rangement_tableau_Croissant
	void testTriCroissant() {
        int Tab[] = {19,18,17,16,15};
        int TabAttendu[] = {15,16,17,18,19};
        TriTableau.triCroissant(Tab);
        assertEquals(Tab[0],TabAttendu[0]);
        
        int Tab2[] = {9,4,6,1};
        int TabAttendu2[] = {1,4,6,9};
        TriTableau.triCroissant(Tab2);
        assertEquals(Tab2[0],TabAttendu2[0]);
        
        //TestBonOrdre
        for (int i = 0; i < Tab.length - 1; i++) {
            assertTrue(Tab[i] <= Tab [i+1]);
        }

    }

	@Test
	//Test_rangement_tableau_Decroissant
	void testTriDecroissant() {
		int Tab3[] = {5,6,7,8};
        int TabAttendu3[] = {8,7,6,5};
        TriTableau.triDecroissant(Tab3);
        assertEquals(Tab3[0],TabAttendu3[0]);
 
        //TestBonOrdre
        for (int i = 0; i < Tab3.length - 1; i++) {
            assertTrue(Tab3[i] >= Tab3 [i+1]);
        }
	}

}
