package fr.uha.ensisa.gl.BBRtesting.modele;

import java.util.ArrayList;

public class TestCaseExecution {
	public static ArrayList<TestCaseExecution> let = new ArrayList<TestCaseExecution>();
	public static ArrayList<EtapeExecution> lee;
	public static TestCase tc;
	public static  boolean success;

	public TestCaseExecution() {
		lee = new ArrayList<EtapeExecution>();
		tc = new TestCase();
		success = false;
	}

	public TestCaseExecution(ArrayList<EtapeExecution> e,TestCase tc ,boolean b) {
		lee = e;
		success = b;
		this.tc = tc;
	}

	public void addTestCaseExecution() {
		let.add(this);
	}

	public void addEtapeExecution(EtapeExecution ex) {
		lee.add(ex);
	}

	public ArrayList<EtapeExecution> getEtapesExecutions() {
		return lee;
	}
  //
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setLee(ArrayList<EtapeExecution> lee) {
		this.lee = lee;
	}

	public TestCase getTestCase() {
		return tc;
	}

	public void setTestCase(TestCase tc) {
		this.tc = tc;
	}
}
