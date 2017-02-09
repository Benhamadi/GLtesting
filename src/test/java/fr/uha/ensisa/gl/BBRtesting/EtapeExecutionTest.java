package fr.uha.ensisa.gl.BBRtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.uha.ensisa.gl.BBRtesting.modele.Etape;
import fr.uha.ensisa.gl.BBRtesting.modele.EtapeExecution;

public class EtapeExecutionTest {

	@Test
	public void testConstEtapeExecution() {
		EtapeExecution e = new EtapeExecution();

		assertEquals("", e.getCommentaire());
		assertEquals(false, e.isSuccess());
	}

	@Test
	public void testConstEvalEtape() {
		Etape e = new Etape();
		EtapeExecution ex = new EtapeExecution(e, "commentaire", true);
		assertEquals("commentaire", ex.getCommentaire());
		assertEquals(true, ex.isSuccess());
	}

	@Test
	public void testgetEtape() {
		EtapeExecution ex = new EtapeExecution();
		assertEquals(EtapeExecution.etape, ex.getEtape());
	}

	@Test
	public void testsetEtape() {
		EtapeExecution ex = new EtapeExecution();
		Etape e = new Etape();
		ex.setEtape(e);
		assertEquals(e, ex.getEtape());
	}

	@Test
	public void testgetCommentaire() {
		EtapeExecution ex = new EtapeExecution();
		assertEquals(EtapeExecution.commentaire, ex.getCommentaire());

	}

	@Test
	public void testsetCommentaire() {
		EtapeExecution ex = new EtapeExecution();
		ex.setCommentaire("voici un test commentaire");
		assertEquals("voici un test commentaire", ex.getCommentaire());
	}

	@Test
	public void testisSuccess() {
		EtapeExecution ex = new EtapeExecution();
		assertEquals(EtapeExecution.success, ex.isSuccess());
	}

	@Test
	public void testsetSuccess() {
		EtapeExecution ex = new EtapeExecution();
		ex.setSuccess(true);
		assertEquals(true, ex.isSuccess());
	}
}
