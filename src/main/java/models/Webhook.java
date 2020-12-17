package models;

public class Webhook {

	private String nom;
	private String description;
	private String nomApplicationAppelante ;
	private Webhook action ;
	
	
	
	
	
	public Webhook() {
		super();
	}





	public Webhook(String nom, String description, String nomApplicationAppelante, Webhook action) {
		super();
		this.nom = nom;
		this.description = description;
		this.nomApplicationAppelante = nomApplicationAppelante;
		this.action = action;
	}





	public String getNom() {
		return nom;
	}





	public void setNom(String nom) {
		this.nom = nom;
	}





	public String getDescription() {
		return description;
	}





	public void setDescription(String description) {
		this.description = description;
	}





	public String getNomApplicationAppelante() {
		return nomApplicationAppelante;
	}





	public void setNomApplicationAppelante(String nomApplicationAppelante) {
		this.nomApplicationAppelante = nomApplicationAppelante;
	}





	public Webhook getAction() {
		return action;
	}





	public void setAction(Webhook action) {
		this.action = action;
	}
	
	
	
	
	
	
	 
}
