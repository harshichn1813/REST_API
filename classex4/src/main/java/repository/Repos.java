package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Details;

public interface Repos extends JpaRepository<Details,Integer> 
	{
	
}



