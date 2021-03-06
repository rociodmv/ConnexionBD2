package org.rocio.connexion.test;

import org.rocio.connexion.config.LibraryConfig;
import org.rocio.connexion.model.Author;
import org.rocio.connexion.model.Book;
import org.rocio.connexion.service.LibraryServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1_Dao {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class);
		LibraryServiceImpl service = context.getBean(LibraryServiceImpl.class);
		Book book = context.getBean(Book.class);
		Author author = context.getBean(Author.class);
		
		System.out.println("Testing");
		
		author.setAge(23);
		author.setName("Paquito");
		author.setSurname("Chocolatero");
		
		book.setId(3);
		book.setEditor("Rocio");
		book.setTitle("Music for parties");
		book.setAuthor(author);
		
		//service.addBook();
		
		System.out.println(book);

	}

}
