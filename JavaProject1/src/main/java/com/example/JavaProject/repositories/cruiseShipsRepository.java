package com.example.JavaProject.repositories;

import com.example.JavaProject.repositories.models.cruiseShips;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cruiseShipsRepository extends JpaRepository<cruiseShips, Integer> {

}
