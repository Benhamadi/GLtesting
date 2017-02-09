package fr.uha.ensisa.gl.BBRtesting;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import fr.uha.ensisa.gl.BBRtesting.modele.Etape;
import fr.uha.ensisa.gl.BBRtesting.modele.TestCase;
import fr.uha.ensisa.gl.BBRtesting.modele.TestCaseExecution;

public class TestCaseTest {
	
	@Test
	public void TestConstTestCase()
	{
		TestCase t = new TestCase();
		assertNotNull(t.getEtapes());
		assertEquals("", t.getId());
		assertEquals("", t.getDescri());
		assertEquals("", t.getDate());
	}
	@Test
	public void TestConstEvalTestCase()
	{
		TestCase t = new TestCase("id1", "desc1", "date1");
		assertNotNull(t.getEtapes());
		assertEquals("id1", t.getId());
		assertEquals("desc1", t.getDescri());
		assertEquals("date1", t.getDate());
	}
	
	@Test
	public void TestsetEtapes() {
		TestCase t = new TestCase();
		ArrayList<Etape> etapes = new ArrayList<Etape>();
		t.setEtapes(etapes);
		assertEquals(etapes, t.getEtapes());
	}
	@Test
	public void TestaddTestCase()
	{
		TestCase t = new TestCase();
		t.addTestCase();
		assertEquals(t,TestCase.ltc.get(TestCase.ltc.size()-1));
	}
	@Test
	public void TestgetTestCases()
	{
		TestCase t = new TestCase();
		assertEquals(TestCase.ltc, t.getTestCases());
	}
	@Test
	public void TestaddEtape()
	{
		TestCase t = new TestCase();
		Etape e = new Etape();
		t.addEtape(e);
		assertEquals(e, t.getEtapes().get(t.getEtapes().size()-1));
	}
	@Test
	public void TestremoveEtapeexist()
	{
		TestCase t = new TestCase();
		Etape e = new Etape(4,"etape","desc");
		t.addEtape(e);
		t.removeEtape(4);
		assertEquals(0,t.getEtapes().size());
	}
	@Test
	public void TestremoveEtapeNotExist()
	{
		TestCase t = new TestCase();
		Etape e = new Etape(4,"etape","desc");
		t.addEtape(e);
		t.removeEtape(5);
		assertEquals(1,t.getEtapes().size());
	}
	
}
