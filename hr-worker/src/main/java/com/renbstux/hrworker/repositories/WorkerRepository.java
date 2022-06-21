package com.renbstux.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renbstux.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
