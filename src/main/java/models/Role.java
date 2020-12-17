package models;

public class Role {
	protected String nomRole;

	
	
	public Role() {
		super();
	}



	public Role(String nomRole) {
		super();
		this.nomRole = nomRole;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomRole == null) ? 0 : nomRole.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		if (nomRole == null) {
			if (other.nomRole != null)
				return false;
		} else if (!nomRole.equals(other.nomRole))
			return false;
		return true;
	}
	
	
	
	

}
