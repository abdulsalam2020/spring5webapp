package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Book;

/**
 * @author Abdul
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
