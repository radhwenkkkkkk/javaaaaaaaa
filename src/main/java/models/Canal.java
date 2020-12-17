package models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





public class Canal implements Comparable<Canal> {

	protected Map<Role, List<Utilisateur>> mapping_role_utilisateurs =new HashMap<Role,List<Utilisateur>>();   
	
	protected Map<Role, List<Habilitation>> mapping_role_habilitations =new HashMap<Role,List<Habilitation>>();       

	
	public Integer ordre ;
	
	protected String nom ;
	
	
	
protected ArrayList<Webhook> webhooks;
protected ArrayList<Message> historiques;
	
	public Canal() {
		
		webhooks = new ArrayList<Webhook>();
		historiques = new ArrayList<Message>();
	}

	public Canal(Map<Role, List<Utilisateur>> mapping_role_utilisateurs,
			Map<Role, List<Habilitation>> mapping_role_habilitations, Integer ordre, String nom,
			ArrayList<Webhook> webhooks, ArrayList<Message> historiques) {
		super();
		this.mapping_role_utilisateurs = mapping_role_utilisateurs;
		this.mapping_role_habilitations = mapping_role_habilitations;
		this.ordre = ordre;
		this.nom = nom;
		this.webhooks = webhooks;
		this.historiques = historiques;
	}

	public Canal(Map<Role, List<Utilisateur>> mapping_role_utilisateurs,
			Map<Role, List<Habilitation>> mapping_role_habilitations, Integer ordre, String nom) {
		super();
		this.mapping_role_utilisateurs = mapping_role_utilisateurs;
		this.mapping_role_habilitations = mapping_role_habilitations;
		this.ordre = ordre;
		this.nom = nom;
	}

	public Map<Role, List<Utilisateur>> getMapping_role_utilisateurs() {
		return mapping_role_utilisateurs;
	}

	public void setMapping_role_utilisateurs(Map<Role, List<Utilisateur>> mapping_role_utilisateurs) {
		this.mapping_role_utilisateurs = mapping_role_utilisateurs;
	}

	public Map<Role, List<Habilitation>> getMapping_role_habilitations() {
		return mapping_role_habilitations;
	}

	public void setMapping_role_habilitations(Map<Role, List<Habilitation>> mapping_role_habilitations) {
		this.mapping_role_habilitations = mapping_role_habilitations;
	}

	public Integer getOrdre() {
		return ordre;
	}

	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Webhook> getWebhooks() {
		return webhooks;
	}

	public void setWebhooks(ArrayList<Webhook> webhooks) {
		this.webhooks = webhooks;
	}

	public ArrayList<Message> getHistoriques() {
		return historiques;
	}

	public void setHistoriques(ArrayList<Message> historiques) {
		this.historiques = historiques;
	}

	
	
	
	public void ecrireMessage(Utilisateur u, Message m) {
		
		
		String message = u + "a ecrit"+ m ;
		System.out.println(message);
	}
	

	@Override
	public int compareTo(Canal o) {
		return getOrdre() - o.getOrdre();
	}


	
	
	
	
}
