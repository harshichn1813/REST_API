package com.example.homehelper3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.homehelper3.Entity.ServiceCategories;

public interface ServiceRepo extends JpaRepository<ServiceCategories, String> {


}
