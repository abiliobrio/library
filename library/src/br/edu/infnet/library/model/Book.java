package br.edu.infnet.library.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Book {

	
	@Id 
	@GeneratedValue
	private Integer isbn;

	private String bookTitle;
	private Date DateOfPublication;
	
	public Book(String bookTitle, Date dateOfPublic) {
		this.bookTitle = bookTitle;
		this.DateOfPublication = dateOfPublic;
	}
	
	@OneToOne
	private Author author;
	
	@OneToOne
	private Category category;
	
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
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
	public Date getDateOfPublication() {
		return DateOfPublication;
	}
	public void setDateOfPublication(Date dateOfPublication) {
		DateOfPublication = dateOfPublication;
	}
	
}
