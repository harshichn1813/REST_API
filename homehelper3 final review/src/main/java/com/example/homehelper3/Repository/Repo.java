package com.example.homehelper3.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.homehelper3.Entity.UserDetails;

public interface Repo extends JpaRepository<UserDetails, String> {
	@Query("SELECT u FROM UserDetails u WHERE u.email = :email")
	   public UserDetails findByEmail(@Param("email") String email);
}
