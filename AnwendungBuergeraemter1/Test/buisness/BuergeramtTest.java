package buisness;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import business.Buergeramt;

public class BuergeramtTest {
	 private Buergeramt buergeramt;

	    @BeforeEach
	    void ausfuellen() throws Exception {
	        buergeramt = new Buergeramt("B�rgerb�ro", 9.00f, 17.00f, "Querenburg H�he 256", new String[]{"Hauptwohnsitz", "Nebenwohnsitz"});
	    }
	    @Test
	    void TextBuergeramt() {
	    	assertTrue(()->this.buergeramt.getGeoeffnetVon()==9.00f);
	    	assertTrue(this.buergeramt.getGeoeffnetBis()==17.00f);
	    	assertTrue(this.buergeramt.getStrasseHNr().equals("Querenburg H�he 256"));
	    	
//	    	ArrayList<String> dienstleistungen = buergeramt.getDienstleistungen();
//	        assertEquals(2, dienstleistungen.size());
//	        assertEquals("Service1", dienstleistungen);
//	        assertEquals("Service2", dienstleistungen);
	        
	    }
}









/*
 * 
 * package business;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.Test;

class TestKonstruktorBuergeramt1 {


	@Test
	void test() {
		String[] dienstleistung = new String[] {"Hauptwohmsitz", "Nebenwohnsitz"};  
		Buergeramt buergeramt = new Buergeramt("Bürgerbüro Querenburg", 9.00f, 17.00f, "Querenburger Höhe 256", dienstleistung);
		
		BooleanSupplier isNameCorrect = () ->  {
			if( buergeramt.getName() == "Bürgerbüro Querenburg") {
				return true;

			}
			return false; 
		};
		assertTrue(isNameCorrect.getAsBoolean());
	}

}
 * 
 * */



/*
 * 
 * 
 * package business;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestKonstruktorFehlermeldung {


	@Test
	void test() {
		IllegalArgumentException t =  assertThrows(IllegalArgumentException.class, () ->  {new Buergeramt("Bürgerbüro Querenburg", 9.00f, 17.00f, "Querenburger Höhe 256", null);});	
		assertEquals(t.getMessage(), "Dienstleistung is null");
	}

}

 * 
 * 
 * */



