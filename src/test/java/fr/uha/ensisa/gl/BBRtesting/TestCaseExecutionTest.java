package fr.uha.ensisa.gl.BBRtesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import fr.uha.ensisa.gl.BBRtesting.modele.Etape;
import fr.uha.ensisa.gl.BBRtesting.modele.EtapeExecution;
import fr.uha.ensisa.gl.BBRtesting.modele.TestCase;
import fr.uha.ensisa.gl.BBRtesting.modele.TestCaseExecution;

public class TestCaseExecutionTest {

	@Test
	public void TestConstTestCaseExecution() {
		TestCaseExecution t = new TestCaseExecution();
		assertNotNull(t.getEtapesExecutions());
		assertNotNull(t.getTestCase());
		assertEquals(false, t.isSuccess());

	}

	@Test
	public void TestConstEvalTestCaseExecution() {
		ArrayList<EtapeExecution> e = new ArrayList<EtapeExecution>();
		TestCase tc = new TestCase();
		TestCaseExecution tx = new TestCaseExecution(e, tc, true);
		assertEquals(e, tx.getEtapesExecutions());
		assertEquals(tc, tx.getTestCase());
		assertEquals(true, tx.isSuccess());
	}

	@Test
	public void TestaddTestCaseExecution() {
		TestCaseExecution tx = new TestCaseExecution();
		tx.addTestCaseExecution();
		assertEquals(tx,
				TestCaseExecution.let.get(TestCaseExecution.let.size() - 1));

	}

	@Test
	public void TestaddEtapeExecution() {
		TestCaseExecution tx = new TestCaseExecution();
		EtapeExecution ex1 = new EtapeExecution();
		tx.addEtapeExecution(ex1);
		assertEquals(ex1,
				TestCaseExecution.lee.get(TestCaseExecution.lee.size() - 1));
	}

	@Test
	public void TestgetEtapesExecutions() {
		TestCaseExecution tx = new TestCaseExecution();
		assertEquals(TestCaseExecution.lee, tx.getEtapesExecutions());
	}

	@Test
	public void TestisSuccess() {
		TestCaseExecution tx = new TestCaseExecution();
		assertEquals(TestCaseExecution.success, tx.isSuccess());
	}

	@Test
	public void TestsetSuccess() {
		TestCaseExecution tx = new TestCaseExecution();
		tx.setSuccess(false);
		assertEquals(false, tx.isSuccess());
	}

	@Test
	public void TestsetLee() {
		TestCaseExecution tx = new TestCaseExecution();
		ArrayList<EtapeExecution> lee1 = new ArrayList<EtapeExecution>();
		tx.setLee(lee1);
		assertEquals(lee1, tx.getEtapesExecutions());
	}

	@Test
	public void TestgetTestCase() {
		TestCaseExecution tx = new TestCaseExecution();
		assertEquals(TestCaseExecution.tc, tx.getTestCase());
	}

	@Test
	public void TestsetTestCase() {
		TestCaseExecution tx = new TestCaseExecution();
		TestCase t = new TestCase();
		tx.setTestCase(t);
		assertEquals(t, tx.getTestCase());
	}
}
