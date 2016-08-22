package org.rocio.connexion.service;

import javax.annotation.Resource;

import org.rocio.connexion.dao.ILibrary;
import org.rocio.connexion.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl {

	@Resource
	ILibrary dao;

	
	public void addBook(Book b) {
		dao.addBook(b);
		System.out.println("Book service");
	}
	
	public LibraryServiceImpl() {

	}

	public LibraryServiceImpl(ILibrary dao) {
		super();
		this.dao = dao;
	}

	public ILibrary getDao() {
		return dao;
	}

	@Autowired
	public void setDao(ILibrary dao) {
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "LibraryServiceImpl [dao=" + dao + "]";
	}

	
	

}
