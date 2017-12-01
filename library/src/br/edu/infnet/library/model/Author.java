package br.edu.infnet.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {

	@Id 
	@GeneratedValue
	private int authorId;
	
	private String authorFirstname;
	
	private String authorSurname;
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorFirstname() {
		return authorFirstname;
	}
	public void setAuthorFirstname(String authorFirstname) {
		this.authorFirstname = authorFirstname;
	}
	public String getAuthorSurname() {
		return authorSurname;
	}
	public void setAuthorSurname(String authorSurname) {
		this.authorSurname = authorSurname;
	}
		
}
