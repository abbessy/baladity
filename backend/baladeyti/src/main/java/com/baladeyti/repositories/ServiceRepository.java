package com.baladeyti.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baladeyti.models.Service;

public interface ServiceRepository extends JpaRepository<Service, Integer>{

	public Optional<Service> findByNom(String nom);
}
