package service;

import java.util.ArrayList;

import model.Modalidade;

public class SModalidade {
	private ArrayList<Modalidade> arMod;
	private static Modalidade m = new Modalidade("Musculacao");
	private static Modalidade m1 = new Modalidade("Muay_Thai");
	private static Modalidade m2 = new Modalidade("Kickboxing");
	private static Modalidade m3 = new Modalidade("Jujitsu");
	private static Modalidade m4 = new Modalidade("Step");

	public SModalidade() {
		super();
		this.arMod = new ArrayList<Modalidade>();
	}
	
	public void fillMod(){
		this.arMod.add(m);
		this.arMod.add(m1);
		this.arMod.add(m2);
		this.arMod.add(m3);
		this.arMod.add(m4);
	}
	
	public ArrayList<Modalidade> getArMod() {
		return arMod;
	}

	public void setArMod(ArrayList<Modalidade> arMod) {
		this.arMod = arMod;
	}
}
