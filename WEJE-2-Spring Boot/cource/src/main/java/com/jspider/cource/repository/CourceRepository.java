package com.jspider.cource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspider.cource.enitity.Cource;

@Repository
public interface CourceRepository extends JpaRepository<Cource, Integer> {

	public Cource findByName(String name);
}
