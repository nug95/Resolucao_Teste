package model;

import java.util.ArrayList;

public class Cliente {
	
	private int		ID;
	private String	nome, contacto;
	private ArrayList<Modalidade> arMod;
	
	public Cliente(int iD, String nome, String contacto) {
		super();
		ID = iD;
		this.nome = nome;
		this.contacto = contacto;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	public ArrayList<Modalidade> getArMod() {
		return arMod;
	}

	public void setArMod(ArrayList<Modalidade> arMod) {
		this.arMod = arMod;
	}
}
