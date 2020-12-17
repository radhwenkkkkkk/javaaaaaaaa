package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServeurDiscussion {
	
	protected Map<Role, List<Utilisateur>> mapping_role_utilisateurs =new HashMap<Role,List<Utilisateur>>();   
	protected ArrayList<Canal> canaux;
	
	
	protected String nom;
	
	protected Map<Role, List<Habilitation>> mapping_role_habilitations =new HashMap<Role,List<Habilitation>>();

	public ServeurDiscussion() {
		 canaux= new ArrayList<Canal>() ;
	}
	
	public ServeurDiscussion(String nom) {
		super();
		this.nom = nom;
	}   


	public ServeurDiscussion(Map<Role, List<Utilisateur>> mapping_role_utilisateurs, ArrayList<Canal> canaux,
			String nom, Map<Role, List<Habilitation>> mapping_role_habilitations) {
		super();
		this.mapping_role_utilisateurs = mapping_role_utilisateurs;
		this.canaux = canaux;
		this.nom = nom;
		this.mapping_role_habilitations = mapping_role_habilitations;
	}

	

	
	

}
