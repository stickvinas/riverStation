package com.example.JavaProject.repositories;

import com.example.JavaProject.repositories.models.cruiseDestination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface homePageRepository extends JpaRepository<cruiseDestination, Integer> {
}
