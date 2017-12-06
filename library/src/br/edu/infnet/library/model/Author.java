package br.edu.infnet.library.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.edu.infnet.library.model.Book;

@Entity
public class Author {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authorId;
	
	private String authorFirstname;
	private String authorSurname;
	
	@OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
	private List<Book> books = new ArrayList<>();
	
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
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
		
}
