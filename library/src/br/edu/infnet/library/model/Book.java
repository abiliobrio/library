package br.edu.infnet.library.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Book {

	
	@Id 
	@GeneratedValue
	private Integer isbn;

	private String bookTitle;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar DateOfPublication;
	
	public Book(String bookTitle, Calendar dateOfPublic) {
		this.bookTitle = bookTitle;
		this.DateOfPublication = dateOfPublic;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Author author = new Author();
	 
	@ManyToMany
	private List<Category> category = new ArrayList<>();
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public Calendar getDateOfPublication() {
		return DateOfPublication;
	}
	public void setDateOfPublication(Calendar dateOfPublication) {
		DateOfPublication = dateOfPublication;
	}
	public List<Category> getCategory() {
		return category;
	}
	public void setCategory(List<Category> category) {
		this.category = category;
	}
	
}
