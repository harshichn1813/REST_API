package bookservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookentity.BookDetails;
import bookrepository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository book;
	//POST
	public BookDetails saveinfo(BookDetails details)
	{
		return book.save(details);
	}
	//GET
	public List<BookDetails> showinfo()
	{
		return book.findAll();
	}
	//GET
	 public BookDetails getDetailsById(int id)
	    {
	        return book.findById(id).get();
	    }
	 //PUT
	 public BookDetails UpdateDetails(BookDetails details)
		{
			return book.save(details);
		}
	 //DELETE
	 public void deleteid(int id)
		{
			book.deleteById(id);
		}

}
