package com.example.homehelper3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.homehelper3.Entity.HelperDetails;

public interface HelperRepo extends JpaRepository<HelperDetails, String> {


}