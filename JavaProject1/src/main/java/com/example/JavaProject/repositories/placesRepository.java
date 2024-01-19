package com.example.JavaProject.repositories;

import com.example.JavaProject.repositories.models.cruisePlaces;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface placesRepository extends JpaRepository<cruisePlaces, Integer> {
}
