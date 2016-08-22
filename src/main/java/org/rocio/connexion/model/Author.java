package org.rocio.connexion.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
@Embeddable
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int authorId;
	private String name;
	private String surname;
	private int age;
	@OneToMany(mappedBy="author", cascade={CascadeType.PERSIST, CascadeType.ALL})
	private List<Book> bookList = new ArrayList<>();

	


	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Author(int authorId, String name, String surname, int age, List<Book> bookList) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.bookList = bookList;
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + ", surname=" + surname + ", age=" + age
				+ ", bookList=" + bookList + "]";
	}





}
