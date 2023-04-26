package com.csiramone.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csiramone.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	
}
