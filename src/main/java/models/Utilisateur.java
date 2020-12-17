package models;

import java.util.ArrayList;

public class Utilisateur {
	protected String prenom ;
	protected String nom ;
	protected String login ;
	protected String motDePasse ;
	protected String mail ;
	
	
	protected ArrayList<ServeurDiscussion> serveurs;


	public Utilisateur() {
	serveurs = new ArrayList<ServeurDiscussion>();
	}
	
	


	public Utilisateur(String prenom, String nom, String login, String motDePasse, String mail) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.mail = mail;
	}




	public Utilisateur(String prenom, String nom, String login, String motDePasse, String mail,
			ArrayList<ServeurDiscussion> serveurs) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.mail = mail;
		this.serveurs = serveurs;
	}
	
  
	
}
