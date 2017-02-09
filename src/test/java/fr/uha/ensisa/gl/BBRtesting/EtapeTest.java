package fr.uha.ensisa.gl.BBRtesting;

import java.util.ArrayList;


import org.junit.Test;

import static org.junit.Assert.*;
import fr.uha.ensisa.gl.BBRtesting.modele.Etape;

public class EtapeTest { 
	
	
	@Test
	public void testConstEtape()
	{
		Etape e = new Etape();
		assertEquals(e.getId(), 0);
		assertEquals("",e.getTitre());	
		assertEquals("",e.getDescription());
	}
	@Test
	public void testConstEvalEtape()
	{
		Etape e = new Etape(0,"titreTest","descTest");
		assertEquals(e.getId(), 0);
		assertEquals("titreTest",e.getTitre());	
		assertEquals("descTest",e.getDescription());
	}
	 
    @Test
	public void testsetTitre() {
   	    Etape etp = new Etape();
   	    etp.setTitre("testTitre");
   	   assertEquals("testTitre",etp.getTitre());
		
	}
    
	
	@Test
	public void testsetDescription() {
		Etape etp = new Etape();
		etp.setDescription("Destcription");;
   	    assertEquals("Destcription",etp.getDescription());
	}
	@Test 
	public void testSetId()
	{
		Etape e = new Etape();
		e.setId(5);
		assertEquals(5,e.getId());
	}
    

}
