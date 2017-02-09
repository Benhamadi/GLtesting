package fr.uha.ensisa.gl.BBRtesting.modele;
import java.awt.List;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class TestCase  {
	
	public static ArrayList<TestCase> ltc = new ArrayList<TestCase>();

	
	protected String id;
	protected ArrayList<Etape> etapes;
	protected String descri;
	protected String date;

	public TestCase(String _id, String _descri, String _date) {
		etapes = new ArrayList<Etape>();
		this.descri = _descri;
		this.id = _id;
		this.date = _date;
	}

	public void setEtapes(ArrayList<Etape> etapes) {
		this.etapes = etapes;
	}

	/**
	 * Constructeur par defaut
	 */
	public TestCase() {
		etapes = new ArrayList<Etape>();
		this.id = "";
		this.descri = "";
		this.date = "";
	}

	/**
	 
	 * 
	 * @return liste des etapes
	 */
	public ArrayList<Etape> getEtapes() {
		return etapes;
	}

	/**
	 *  fonction d'ajout dans le fichier
	 */
	public void addTestCase() {
		TestCase.ltc.add(this);
	}

	/**
	 * fonction de recuperation de la liste des TestCase a partir du
	 * fichier
	 */
	public ArrayList<TestCase> getTestCases() {
		return TestCase.ltc;
	}

	public String getDescri() {
		return descri;
	}

	public String getDate() {
		return date;
	}

	public String getId() {
		return id;
	}

	public void addEtape(Etape e) {
		etapes.add(e);
	}

	public void removeEtape(int id) {
		for(int i=0;i<this.getEtapes().size();i++)
		{
			if(this.getEtapes().get(i).getId() == id)
			{
				this.getEtapes().remove(i);
				break;
			}	
				
		}
        
	}
	
}
