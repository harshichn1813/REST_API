package service;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Details;
import repository.Repos;

@Service
public class Services 
{
@Autowired
Repos r;
public Details saveinfo(Details d)
{
	return r.save(d);
}
public List<Details> showinfo()
{
	return r.findAll();
}
public String changeinfoid(int id,Details d)
{
	r.saveAndFlush(d);
	if(r.existsById(id))
	{
		return "Updated";
	}
	else
	{
		return "Enter valid Id";
	}
}

public void deleteid(int id)
{
	r.deleteById(id);
}

}

