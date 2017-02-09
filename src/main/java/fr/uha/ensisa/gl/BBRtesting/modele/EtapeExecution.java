package fr.uha.ensisa.gl.BBRtesting.modele;

public class EtapeExecution {
	public static Etape etape;
	public static String commentaire;
	public static boolean success;
	
	public EtapeExecution() {
		etape = new Etape();
		commentaire = "";
		success = false;
	}
	
	public EtapeExecution(Etape e,String commentaire,boolean success)
	{
		this.etape = e;
		this.commentaire = commentaire;
		this.success = success;
	}

	public Etape getEtape() {
		return etape;
	}

	public void setEtape(Etape e) {
		this.etape = e;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	

}
