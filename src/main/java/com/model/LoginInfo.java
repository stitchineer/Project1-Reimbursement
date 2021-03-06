package com.model;

import javax.persistence.*;

@Entity(name = "logins")
@Table(name = "logins")
public class LoginInfo {
	@Id
	String email;
	@Column
	String first_name; 
	@Column
	String last_name;
	@Column
	String pswd;
	@Column
	String id;
	@Column
	String birthday;

	public LoginInfo(String first_name, String last_name, String email, String pswd, String id, String birthday) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.pswd = pswd;
		this.id = id;
		this.birthday = birthday;
	}
	
	public String getId() {
		return id;
	}
 
	public void setId(String id) {
		this.id = id;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public LoginInfo() {
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPswd() {
		return pswd;
	}
	
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
	@Override
	public String toString() {
		int l = pswd.length() + 1;
		String pswdS = "";
		for(int i = 0; i < l ; i++ ) {
			pswdS = pswdS + "*";
		}
		return "\nLogin Credentials: " + first_name + " " + last_name + ", " + email + " "+birthday+" "+ pswdS;
	}

}
