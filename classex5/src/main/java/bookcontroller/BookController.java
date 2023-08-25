package bookcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bookentity.BookDetails;
import bookservice.BookService;
@RestController

public class BookController {
	@Autowired
	BookService service;
	@PostMapping("save")
	public BookDetails add(@RequestBody BookDetails d)
	{
		return service.saveinfo(d);
	}
	@GetMapping("show")
	public List<BookDetails>show()
	{
		return service.showinfo();
	}
	@GetMapping("/{id}")
	public BookDetails getDetailsById(@PathVariable int id) 
	{
		return service.getDetailsById(id);
	}
	@PutMapping("/Update")
	public BookDetails UpdateInfo(@RequestBody BookDetails details)
	{
		return service.UpdateDetails(details);
	}
	@DeleteMapping()
	public void deleteId(@PathVariable int id)
	{
		service.deleteid(id);
	}
}
