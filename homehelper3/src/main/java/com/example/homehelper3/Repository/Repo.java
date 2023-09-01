package com.example.homehelper3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.homehelper3.Entity.UserDetails;

public interface Repo extends JpaRepository<UserDetails, String> {


}
