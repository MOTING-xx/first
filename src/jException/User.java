package jException;

public class User {
	int id;
	String email;
	String pwd;
	
	public User() {
		super();
	}
	
	public User(int id, String email, String pwd) {
		super();
		this.id = id;
		this.email = email;
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "User [email=" + email + ", id=" + id + "]";
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(this == obj){
			return true;
		}
		if(obj instanceof User){
			User o = (User)obj;
			return id == o.id;
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return id;
	}
	
	

}
