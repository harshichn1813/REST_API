package bookrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import bookentity.BookDetails;

public interface BookRepository  extends JpaRepository<BookDetails,Integer>{

}
