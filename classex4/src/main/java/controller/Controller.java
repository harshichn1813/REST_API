package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Details;
import service.Services;

@RestController


public class Controller {
@Autowired
Services s;
@PostMapping("save")
public Details add(@RequestBody Details d)
{
	return s.saveinfo(d);
}
@GetMapping("show")
public List<Details>show()
{
	return s.showinfo();
}
@PutMapping()
public String modifybyid(@PathVariable int id,@RequestBody Details d)
{
	return s.changeinfoid(id,d);
}

@DeleteMapping()
public void deleteId(@PathVariable int id)
{
	s.deleteid(id);
}
}
