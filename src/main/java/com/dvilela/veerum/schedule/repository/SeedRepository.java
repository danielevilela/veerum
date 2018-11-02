package com.dvilela.veerum.schedule.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dvilela.veerum.schedule.model.Seed;

public interface SeedRepository extends JpaRepository<Seed,Long> {
	
	@Query("SELECT id, date, value FROM Seed ") 
	List<Seed> filterCustomersByDistance() ;
}
