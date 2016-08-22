package org.rocio.connexion.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.rocio.connexion.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class LibraryImpl implements ILibrary {

	private SessionFactory sessionFactory;

	@Autowired
	public LibraryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	@Override
	public void addBook(Book b) {
		Serializable id = sessionFactory.getCurrentSession().save(b);
		System.out.println("Book in the shelf!");
		
	}
	
	public LibraryImpl() {
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

//	@Override
//	public void addBook() {
//		// TODO Auto-generated method stub
//		
//	}


	

}
